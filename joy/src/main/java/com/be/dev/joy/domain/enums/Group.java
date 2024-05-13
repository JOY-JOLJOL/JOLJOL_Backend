package com.be.dev.joy.domain.enums;

import lombok.Getter;

@Getter
public enum Group {
    
    FRIEND("FRIEND"), // 친구
    LOCAL("LOCAL") // 지역
    ;
    
    private final String group;
    
    Group(String group) {
        this.group = group;
    }
}
