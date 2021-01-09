package com.biggwang.auth.repository;

import com.biggwang.auth.RyuOauthApplication;
import com.biggwang.auth.entity.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Collections;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = RyuOauthApplication.class)
public class UserJpaRepositoryTest {

    @Autowired
    private UserJpaRepository userJpaRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    public void insertNewUser() {
        userJpaRepository.save(User.builder()
                .uid("ghmryg@gmail.1")
                .password(passwordEncoder.encode("1111"))
                .name("biggwang")
                .roles(Collections.singletonList("ROLE_USER"))
                .build());
    }
}