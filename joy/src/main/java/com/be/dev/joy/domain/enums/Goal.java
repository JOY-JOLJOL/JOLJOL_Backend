package com.be.dev.joy.domain.enums;

import lombok.Getter;

@Getter
public enum Goal {

    TIME("TIME", "산책 시간"), // 산책 시간 목표
    DIST("DIST", "산책 거리"), // 산책 거리 목표
    STEP("STEP", "걸음 수") // 걸음 수 목표
    ;

    private final String goal;
    private final String title;

    Goal(String goal, String title) {
        this.goal = goal;
        this.title = title;
    }
}
