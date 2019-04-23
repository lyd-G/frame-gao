package com.frame.common.base.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * 部门树dto
 *
 * @author qmgf
 * @since 2018-09-03
 */
@Data
@Accessors(chain = true)
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "菜单树排序")
public class TreeSortDto<T extends TreeSortDto> extends BaseDto {

    private static final long serialVersionUID = 1L;

    /**
     * 功能代码
     */
    @ApiModelProperty(value = "sortNo")
    private int sortNo;

    /**
     * children
     */
    @ApiModelProperty(value = "children")
    public List<T> children;

    public static final String TREE_CHILDREN = "children";

}