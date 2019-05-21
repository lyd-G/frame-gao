package com.frame.common.base.model;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;

import static org.apache.ibatis.session.RowBounds.NO_ROW_LIMIT;

/**
 * @param <T>
 * @author ly
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString
public class ParamTable<T> extends Param<T> {

    private static final long serialVersionUID = 1L;

    //"当前页码", notes = "默认为1")
    private int current;

    //"页码大小", notes = "默认为20")
    private int size;

    //"排序字段", notes = "默认为空")
    @Setter
    private String orderByField;

    //"是否分页", notes = "默认为TRUE")
    private boolean isPage = true;

    //"是否升序", notes = "默认为TRUE")
    private boolean isAsc;

    /**
     * 是否要把驼峰转成大写下划线格式
     */
    private boolean camelToUnderlineFlg = true;
    /**
     * 复杂多个排序条件
     */
    //"分页排序信息", notes = "复杂多个排序条件，多个以','分隔,例如:name.asc,value.desc ")
    protected String sortString;

    /**
     * 默认的排序条件
     */
    //"分页排序信息", notes = "复杂多个排序条件，多个以','分隔,例如:name.asc,value.desc ")
    protected String defaultSortString;

    /**
     * 默认为1
     *
     * @return
     */
    public int getCurrent() {
        if (current < 1) {
            current = 1;
        }
        return current;
    }

    /**
     *
     */
    public int getSize() {
        if (size < 1) {
            size = 20;
        }
        return size;
    }

    public ParamTable() {

        this.size = 20;
        this.current = 1;
    }


    public String getOrderByFieldByChange() {
        if (camelToUnderlineFlg) {
            return StringUtils.camelToUnderline(this.orderByField);
        } else {
            return this.orderByField;

        }
    }


    /**
     * 把小驼峰转成数据库“_”字段分隔
     *
     * @return
     */
    public Page toPageInfo() {
        if (isPage) {
            return new Page<>(this.getCurrent(), this.getSize());
        } else {
            return new Page<>(this.getCurrent(), NO_ROW_LIMIT);
        }
    }

    /**
     * @return
     */
    public SortPage toSortPageInfo() {
        if (isPage) {
            return new SortPage<>(
                    this.getCurrent(),
                    this.getSize(),
                    this.defaultSortString,
                    this.sortString,
                    this.camelToUnderlineFlg);
        } else {
            return new SortPage<>(
                    this.getCurrent(),
                    NO_ROW_LIMIT,
                    this.defaultSortString,
                    this.sortString,
                    this.camelToUnderlineFlg);
        }
    }

    public <P> SortPage<P> toSortPageInfo(Class<P> typ) {
        if (isPage) {
            return new SortPage<>(
                    this.getCurrent(),
                    this.getSize(),
                    this.defaultSortString,
                    this.sortString,
                    this.camelToUnderlineFlg);
        } else {
            return new SortPage<>(
                    this.getCurrent(),
                    NO_ROW_LIMIT,
                    this.defaultSortString,
                    this.sortString,
                    this.camelToUnderlineFlg);
        }
    }

    @Deprecated
    public <P> Page<P> toPageInfo(Class<P> typ) {
        if (isPage) {
            return new Page<>(this.getCurrent(), this.getSize());
        } else {
            return new Page<>(this.getCurrent(), NO_ROW_LIMIT);
        }
    }
}
