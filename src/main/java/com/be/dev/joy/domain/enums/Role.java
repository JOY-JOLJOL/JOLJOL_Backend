package com.be.dev.joy.domain.enums;

import lombok.Getter;

@Getter
public enum Role {

    MEMBER("MEMBER"), // 일반사용자
    TESTER("TESTER"), // 테스터
    ADMIN("ADMIN") // 관리자
    ;

    private final String role;

    Role(String role) {
        this.role = role;
    }
}
