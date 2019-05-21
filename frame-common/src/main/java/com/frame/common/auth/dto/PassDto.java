package com.frame.common.auth.dto;

import com.alibaba.fastjson.annotation.JSONField;
import com.frame.common.base.model.BaseDto;
import lombok.*;
import org.hibernate.validator.constraints.NotBlank;

/**
 * @author ly
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PassDto extends BaseDto {

    /**
     * 密码
     */
    @NotBlank(message = "{AccountDto.password.NotBlank}")
    @JSONField(serialize = false)
    private String password;

    /**
     * 加密盐
     */
    private String salt;


    /**
     * 用户状态信息
     */
    private String status;
}
