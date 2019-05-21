package com.frame.web.dto;

import com.frame.common.base.model.BaseEntityDto;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * <p>
 * </p>
 *
 * @author ly
 * @since 2019-05-08
 */
@Data
@Accessors(chain = true)
@ApiModel(value = "")
public class UsersDto extends BaseEntityDto {

    private static final long serialVersionUID = 1L;

    private String name;
    private String password;
    private String email;
    private String mobile;
    private String details;
    private String roleId;
    private String description;
    private String usingFlag;
    private String account;


}
