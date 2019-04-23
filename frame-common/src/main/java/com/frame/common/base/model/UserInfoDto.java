package com.frame.common.base.model;

import lombok.*;

import java.util.List;
import java.util.Map;

/**
 * @author qmgf
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserInfoDto extends BaseDto {

    /**
     * 用户ID
     */
    private String id;

    /**
     * 账户
     */
    private String account;

    /**
     * 姓名
     */
    private String name;

    /**
     * 菜单中文集合
     */
    private Map<String, String> titleCNameMap;

    /**
     * 菜单英文集合
     */
    private Map<String, String> titleENameMap;

    /**
     * 菜单按钮编码列表
     */
    private List<MenuButtonsDto> menuButtons;


    /**
     * 菜单 列表
     */
    private List<MenuDto> menus;


    /**
     * 登录选择的机构ID，对应登录选择的公司
     */
    private String loginOrganId;

    /**
     * 登录选择的机构名称，对应登录选择的公司
     */
    private String loginOrganName;

    /**
     * 用户所属集团ID
     */
    private String userGroupId;

    /**
     * 用户所属集团名称
     */
    private String userGroupName;

    /**
     * 用户所属机构ID
     */
    private String userOrganId;

    /**
     * 用户所属机构名称
     */
    private String userOrganName;

    /**
     * 用户所属部门ID
     */
    private String userDeptId;

    /**
     * 用户所属部门名称
     */
    private String userDeptName;
}