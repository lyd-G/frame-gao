package com.frame.common.auth.dto;

import com.frame.common.base.model.BaseDto;
import lombok.*;

/**
 * @author ly
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TokenDto extends BaseDto {
    /**
     * 访问签名
     */
    private String accessToken;

    /**
     * 刷新签名
     */
    private String refreshToken;


}
