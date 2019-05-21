package com.frame.common.base.model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.*;

import static com.frame.common.base.constant.BaseDataConstant.TREE_ROOT;
import static lombok.AccessLevel.PRIVATE;

/**
 * @author: ly
 * @date: 2018/11/23 15:18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ToString
@NoArgsConstructor
public class MenuDto extends TreeSortDto {


    /**
     * 菜单对应页面组件的名字，一定要填写不然使用<keep-alive>时会出现各种问题
     */
    //"菜单对应页面组件的名字")
    private String name;

    /**
     * 菜单隐藏(默认 false)，此处理暂不让设置，因为只返回可见的
     */
    @Setter(PRIVATE)
    //"菜单隐藏(默认 false)")
    private boolean hidden = false;

    /**
     * 菜单meta
     */
    //"菜单meta")
    private MenuMetaDto meta;
    /**
     * 菜单标题 在侧边栏和面包屑中展示的名字
     */
    //"菜单标题")
    @JSONField(serialize = false)
    private String title;

    /**
     * 菜单标题 在侧边栏和面包屑中展示的名字
     */
    //"菜单标题中文")
    @JSONField(serialize = false)
    private String cname;

    /**
     * 菜单标题 在侧边栏和面包屑中展示的名字
     */
    //"菜单标题英文")
    @JSONField(serialize = false)
    private String ename;

    /**
     * 子路由标识
     */
    //"子路由标识")
    @JSONField(serialize = false)
    private boolean subMenuFlag;
    /**
     * 菜单图标
     */
    //"菜单图标")
    @JSONField(serialize = false)
    private String icon;

    /**
     * 如果设置为true ,则不会进行权限check(默认 false，也就是要进行权限检测)
     */
    //"权限检测")
    @JSONField(serialize = false)
    private boolean noAuth;

    /**
     * 如果设置为true ,则不会被 <keep-alive> 缓存(默认 false)
     */
    //"缓存标识")
    @JSONField(serialize = false)
    private boolean noCache;

    /**
     * 树子
     */
    @JSONField(serialize = false)
    private String id;

    /**
     * 树父
     */
    @JSONField(serialize = false)
    private String parentId;

    /**
     * 树根
     *
     * @return
     */
    public static MenuDto rootTree() {
        MenuDto menuTreeDto = new MenuDto();
        menuTreeDto.setParentId(TREE_ROOT + TREE_ROOT);
        menuTreeDto.setId(TREE_ROOT);
        return menuTreeDto;
    }

    /**
     * 树子
     */
    public static final String TREE_ID = "id";
    /**
     * 树父
     */
    public static final String TREE_PARENT_ID = "parentId";


}
