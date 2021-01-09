package com.biggwang.auth.repository;

import com.biggwang.auth.RyuOauthApplication;
import com.biggwang.auth.entity.OauthClientDetailsEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = RyuOauthApplication.class)
public class OauthClientRepositoryTest {

    @Autowired
    private OauthClientRepository oauthClientRepository;

    @Test
    public void INSERT_테스트() {
        oauthClientRepository.save(
                OauthClientDetailsEntity.builder()
                        .clientId("biggwang")
                        .clientSecret("dkfdk349dfsdf")
                        .build()
        );
    }

}