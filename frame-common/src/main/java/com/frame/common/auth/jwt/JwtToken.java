package com.frame.common.auth.jwt;

import com.frame.common.base.util.JwtUtil;
import lombok.Data;
import org.apache.shiro.authc.AuthenticationToken;

/**
 * @author liheng
 */
@Data
public class JwtToken implements AuthenticationToken {

    /**
     * token
     */
    private String token;

    /**
     * 账户
     */
    private String account;


    public JwtToken(String token) {
        this.token = token;
    }

    @Override
    public Object getPrincipal() {
        return JwtUtil.getAccount(token);
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}