package com.biggwang.auth.repository;

import com.biggwang.auth.entity.OauthClientDetailsEntity;
import org.springframework.data.repository.CrudRepository;

public interface OauthClientRepository extends CrudRepository<OauthClientDetailsEntity, Long> {
}
