package com.be.dev.joy.domain.enums;

import lombok.Getter;

@Getter
public enum Status {

    OPEN("OPEN"), // 모집 중
    PROGRESS("PROGRESS"), // 진행 중
    CLOSED("CLOSED") // 종료
    ;

    private final String status;

    Status(String status) {
        this.status = status;
    }
}
