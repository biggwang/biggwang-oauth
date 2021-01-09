package com.biggwang.auth.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "user_roles")
public class UserRoles {

    @Id
    @Column(name = "user_uuid")
    private String userUuid;

    private String roles;
}
