package com.frame.common.base.shiro;


import com.frame.common.base.model.BaseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;

/**
 * @author ly
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Slf4j
@NoArgsConstructor
public class ShiroUser extends BaseDto {

    private static final long serialVersionUID = 1L;
    /**
     * 员工ID
     */
    private String staffId;
    /**
     * jwtID
     */
    private String jwtId;
    /**
     * 用户账户
     */
    private String account;
    /**
     * 用户名称
     */
    private String name;
    /**
     * 终端
     */
    private String terminal;
    /**
     * 组织结构
     */
    private String organId;
    /**
     * 组织结构名称
     */
    private String organName;

    /**
     * 部门ID
     */
    private String deptId;
    /**
     * 部门名称
     */
    private String deptName;

    /**
     * 模拟account的账户
     */
    private String runAsAccount;


    /**
     * 构造函数
     *
     * @param account 账户
     * @param name    姓名
     * @param staffId ID
     */
    public ShiroUser(String account, String name, String staffId) {
        this.account = account;
        this.name = name;
        this.staffId = staffId;
    }


    /**
     * 取得用户信息
     *
     * @return
     */
    public static ShiroUser getCurrentUser() {

        return (ShiroUser) SecurityUtils.getSubject().getPrincipal();

    }

    /**
     * 本函数输出将作为默认的<shiro:principal/>输出.
     */
    @Override
    public String toString() {
        return account + (StringUtils.isNotEmpty(runAsAccount) ? "_" + runAsAccount : "");
    }
}
