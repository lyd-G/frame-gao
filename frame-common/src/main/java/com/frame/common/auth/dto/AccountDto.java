package com.frame.common.auth.dto;

import com.frame.common.auth.dto.validator.group.AccountRunAs;
import lombok.*;

import javax.validation.constraints.NotBlank;

/**
 * @author ly
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AccountDto extends PassDto {
    /**
     * 账户
     */
    @NotBlank(message = "{AccountDto.account.NotBlank}", groups = {AccountRunAs.class})
    private String account;


    /**
     * 终端
     */
    @NotBlank(message = "{AccountDto.terminal.NotBlank}", groups = {AccountRunAs.class})
    private String terminal;


}
