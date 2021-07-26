package com.dal.springboot.domain.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * {description}
 *
 * @author 김달남, shnskr@a2dcorp.co.kr
 * @version 1.0
 * @class Role
 * @modified
 * @since 2021-07-26
 */

@Getter
@RequiredArgsConstructor
public enum Role {

    GUEST("ROLE_GUEST", "손님"),
    USER("ROLE_USER", "일반 사용자");

    private final String key;
    private final String title;

}
