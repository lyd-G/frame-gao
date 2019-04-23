package com.frame.common.auth.dto;

import com.alibaba.fastjson.annotation.JSONField;
import com.frame.common.base.model.BaseDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.hibernate.validator.constraints.NotBlank;

/**
 * @author qmgf
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ToString
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "密码信息容器")
public class PassDto extends BaseDto {

    /**
     * 密码
     */
    @ApiModelProperty(value = "密码信息", required = true)
    @NotBlank(message = "{AccountDto.password.NotBlank}")
    @JSONField(serialize = false)
    private String password;

    /**
     * 加密盐
     */
    @ApiModelProperty(hidden = true)
    private String salt;


    /**
     * 用户状态信息
     */
    @ApiModelProperty(hidden = true)
    private String status;
}
