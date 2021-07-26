package com.dal.springboot.config.auth.dto;

import com.dal.springboot.domain.user.User;
import java.io.Serializable;
import lombok.Getter;

/**
 * {description}
 *
 * @author 김달남, shnskr@a2dcorp.co.kr
 * @version 1.0
 * @class SessionUser
 * @modified
 * @since 2021-07-26
 */

@Getter
public class SessionUser implements Serializable {

    private String name;
    private String email;
    private String picture;

    public SessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }

}
