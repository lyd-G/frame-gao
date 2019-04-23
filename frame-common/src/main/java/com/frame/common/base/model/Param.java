package com.frame.common.base.model;

import com.frame.common.base.model.validation.GaoNotEmpty;
import com.frame.common.base.model.validation.group.DataGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.Valid;
import javax.validation.groups.Default;

/**
 * @param <T>
 * @author qmgf
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ToString
@NoArgsConstructor
@ApiModel(value = "基础输入容器")
public class Param<T> extends BaseDto {
    private static final long serialVersionUID = 1L;
    /**
     * 输入实体参数常量
     */
    public static final String DATA_NAME = "data";

    /**
     * 输入实体
     */
    @Valid
    @ApiModelProperty(value = "输入实体对象")
    @GaoNotEmpty(message = "{QmParam.data.NotEmpty}", groups = DataGroup.class)
    private T data;

    @ApiModelProperty(value = "功能模块", notes = "功能菜单名称")
    @NotBlank(message = "{QmParam.funcModule.NotBlank}", groups = Default.class)
    private String funcModule;

    @ApiModelProperty(value = "操作处理", notes = "功能按钮名称")
    @NotBlank(message = "{QmParam.funcOperation.NotBlank}", groups = Default.class)
    private String funcOperation;

}
