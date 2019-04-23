package com.frame.common.base.model;

import com.alibaba.fastjson.annotation.JSONField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.util.List;

/**
 * <p>
 * <p>
 * </p>
 *
 * @author qmgf
 * @since 2018-01-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ToString
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "菜单按钮编码")
public class MenuButtonsDto extends BaseDto {

    private static final long serialVersionUID = 1L;
    /**
     * 菜单编码
     */
    @ApiModelProperty(value = "菜单编码")
    private String menu;

    /**
     * 无权限控制
     */
    @ApiModelProperty(value = "无权限控制")
    private boolean noAuth;
    /**
     * 无缓存
     */
    @ApiModelProperty(value = "无缓存")
    private boolean noCache;
    /**
     * 按钮编码
     */
    @ApiModelProperty(value = "按钮编码")
    @JSONField(serialize = false)
    private String button;

    /**
     * 按钮编码列表
     */
    @ApiModelProperty(value = "按钮编码列表")
    private List<String> buttons;

}