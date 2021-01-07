package com.biggwang.auth.repository;

import com.biggwang.auth.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserJpaRepository extends CrudRepository<User, Long> {

    Optional<User> findByUid(String email);
}
