package com.dal.springboot.domain.user;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * {description}
 *
 * @author 김달남, shnskr@a2dcorp.co.kr
 * @version 1.0
 * @class UserRepository
 * @modified
 * @since 2021-07-26
 */
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

}
