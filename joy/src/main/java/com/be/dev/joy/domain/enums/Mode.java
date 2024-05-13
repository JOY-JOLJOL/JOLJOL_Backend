package com.be.dev.joy.domain.enums;

import lombok.Getter;

@Getter
public enum Mode {

    SINGLE("SINGLE", "혼자"), // 혼자 모드
    EACH("EACH", "모두"), // 모두 모드
    TOGETHER("TOGETHER", "함께") // 함께 모드
    ;

    private final String mode;
    private final String title;

    Mode(String mode, String title) {
        this.mode = mode;
        this.title = title;
    }
}
