package com.biggwang.auth;

import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@RunWith(JUnit4ClassRunner.class)
public class PasswordEncoderTest {

    @Test
    public void password_encoder_test() {
        PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        System.out.printf("secret: %s", passwordEncoder.encode("testSecret"));
    }
}
