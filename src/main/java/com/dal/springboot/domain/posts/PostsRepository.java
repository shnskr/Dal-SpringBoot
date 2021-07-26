package com.dal.springboot.domain.posts;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * {description}
 *
 * @author 김달남, shnskr@a2dcorp.co.kr
 * @version 1.0
 * @class PostsRepository
 * @modified
 * @since 2021-07-26
 */
public interface PostsRepository extends JpaRepository<Posts, Long> {

    @Query("SELECT p FROM Posts p ORDER BY p.id DESC")
    List<Posts> findAllDesc();

}
