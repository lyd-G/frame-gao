package com.frame.common.base.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author: ly
 * @date: 2018/11/23 15:18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ToString
@AllArgsConstructor
@ApiModel(value = "菜单meta")
public class MenuMetaDto extends BaseDto {

    /**
     * 菜单标题 在侧边栏和面包屑中展示的名字
     */
    @ApiModelProperty(value = "菜单标题")
    private String title;

    /**
     * 菜单图标
     */
    @ApiModelProperty(value = "菜单图标")
    private String icon;

    /**
     * 如果设置为true ,则不会进行权限check(默认 false，也就是要进行权限检测)
     */
    @ApiModelProperty(value = "权限检测")
    private boolean noAuth;

    /**
     * 如果设置为true ,则不会被 <keep-alive> 缓存(默认 false)
     */
    @ApiModelProperty(value = "缓存标识")
    private boolean noCache;


}
