package com.frame.common.auth.shiro;

import com.frame.common.auth.constant.WebCommonConstant;
import com.frame.common.base.config.FrameProperties;
import com.frame.common.base.knowledge.FrameKnowledge;
import com.frame.common.base.util.SecurityUtil;
import com.frame.common.base.util.ThreadLocalUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.web.filter.authc.BasicHttpAuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.cors.CorsConfiguration;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author ly
 */
@Slf4j
public class HeaderFilter extends BasicHttpAuthenticationFilter {

    private static final String LOCALE_LANG = "lang";
    /**
     * 加密秘钥
     */
    private static final String SECRET = "secret";
    /**
     * 系统参数设置
     */
    @Autowired
    private FrameProperties frameProperties;

    /**
     * 对跨域提供支持
     */
    @Override
    protected boolean preHandle(ServletRequest request, ServletResponse response) throws Exception {

        HttpServletRequest httpServletRequest = WebUtils.toHttp(request);
        HttpServletResponse httpServletResponse = WebUtils.toHttp(response);

        // 跨域时会首先发送一个option请求，这里我们给option请求直接返回正常状态
        if (httpServletRequest.getMethod().equals(RequestMethod.OPTIONS.name())) {
            String originHeader = ((HttpServletRequest) request).getHeader("Origin");

            Set<String> allowedOrigins = new HashSet<String>(Arrays.asList(frameProperties.getConfig().getApiAllowedOrigins()));
            if (allowedOrigins.contains(CorsConfiguration.ALL) || allowedOrigins.contains(originHeader)) {
                httpServletResponse.setHeader("Access-control-Allow-Origin", originHeader);
                httpServletResponse.setHeader("Access-control-Allow-Max-Age", "1728000");
                httpServletResponse.setHeader("Access-Control-Allow-Methods", "GET,POST,OPTIONS,PUT,DELETE");
                httpServletResponse.setHeader("Access-Control-Allow-Headers", httpServletRequest.getHeader("Access-Control-Request-Headers"));
                httpServletResponse.setHeader("Access-Control-Expose-Headers", WebCommonConstant.EXPOSE_HEADERS_REFRESH);
                httpServletResponse.setStatus(HttpStatus.OK.value());
            } else {
                httpServletResponse.setStatus(HttpStatus.FORBIDDEN.value());
            }
            return false;
        }
        //多语言信息取得
        String localeLang = httpServletRequest.getHeader(LOCALE_LANG);

        boolean decode = frameProperties.getConfig().isEncryptEnable();
        if (decode) {

            //密码取得
            String secretToken = httpServletRequest.getHeader(SECRET);
            if (StringUtils.isNotEmpty(secretToken)) {
                String aesSecret = SecurityUtil.RsaUtils.decryptByPrivateKey(secretToken, frameProperties.getConfig().getRsaPrivateKey());
                ThreadLocalUtil.setLocaleSecret(aesSecret);
            }
        }

        if (!FrameKnowledge.LocaleLangEnum.isContains(localeLang)) {
            localeLang = FrameKnowledge.LocaleLangEnum.CN.getValue();
        }

        //设备多语言

        ThreadLocalUtil.setLocaleLang(FrameKnowledge.LocaleLangEnum.getLocale(localeLang));
        return true;
    }

    @Override
    public void afterCompletion(ServletRequest request, ServletResponse response, Exception exception) throws Exception {

        HttpServletRequest httpServletRequest = WebUtils.toHttp(request);

        if (httpServletRequest.getMethod().equals(RequestMethod.POST.name())) {

            ThreadLocalUtil.removeLocaleLang();
            ThreadLocalUtil.removeLocaleSecret();
        }


    }

}
