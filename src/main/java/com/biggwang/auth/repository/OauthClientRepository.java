package com.biggwang.auth.repository;

import com.biggwang.auth.entity.OauthClientDetailsEntity;
import com.biggwang.auth.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface OauthClientRepository extends CrudRepository<OauthClientDetailsEntity, Long> {
}
