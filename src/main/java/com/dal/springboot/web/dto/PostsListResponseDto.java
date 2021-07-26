package com.dal.springboot.web.dto;

import com.dal.springboot.domain.posts.Posts;
import java.time.LocalDateTime;
import lombok.Getter;

/**
 * {description}
 *
 * @author 김달남, shnskr@a2dcorp.co.kr
 * @version 1.0
 * @class PostsListResponseDto
 * @modified
 * @since 2021-07-26
 */

@Getter
public class PostsListResponseDto {

    private Long id;
    private String title;
    private String author;
    private LocalDateTime modifiedDate;

    public PostsListResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
        this.modifiedDate = entity.getModifiedDate();
    }

}
