package com.frame.common.base.model;


import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * 部门树dto
 *
 * @author ly
 * @since 2018-09-03
 */
@Data
@Accessors(chain = true)
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class TreeSortDto<T extends TreeSortDto> extends BaseDto {

    private static final long serialVersionUID = 1L;

    /**
     * 功能代码
     */
    //"sortNo")
    private int sortNo;

    /**
     * children
     */
    //"children")
    public List<T> children;

    public static final String TREE_CHILDREN = "children";

}