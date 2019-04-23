package com.frame.common.auth.dto;

import com.frame.common.auth.dto.validator.group.AccountRunAs;
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
@ApiModel(value = "基础返回容器")
public class AccountDto extends PassDto {
    /**
     * 账户
     */
    @ApiModelProperty(value = "账户信息", required = true)
    @NotBlank(message = "{AccountDto.account.NotBlank}", groups = {AccountRunAs.class})
    private String account;


    /**
     * 终端
     */
    @ApiModelProperty(value = "终端信息", required = true)
    @NotBlank(message = "{AccountDto.terminal.NotBlank}", groups = {AccountRunAs.class})
    private String terminal;


    /**
     * 机构ID
     */
    @ApiModelProperty(value = "机构ID")
    private String organId;

    /**
     * 极光推送设备ID
     */
    @ApiModelProperty(value = "极光推送设备ID")
    private String registrationIdForJpush;

}
