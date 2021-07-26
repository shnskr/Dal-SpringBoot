package com.dal.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * {description}
 *
 * @author 김달남, shnskr@a2dcorp.co.kr
 * @version 1.0
 * @class HelloResponseDto
 * @modified
 * @since 2021-07-26
 */

@Getter
@RequiredArgsConstructor
public class HelloResponseDto {

    private final String name;
    private final int amount;

}
