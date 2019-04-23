package com.frame.common.auth.dto;

import com.frame.common.base.model.BaseDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

/**
 * @author qmgf
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ToString
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "签名")
public class TokenDto extends BaseDto {
    /**
     * 访问签名
     */
    @ApiModelProperty(value = "访问签名")
    private String accessToken;

    /**
     * 刷新签名
     */
    @ApiModelProperty(value = "刷新签名")
    private String refreshToken;


}
