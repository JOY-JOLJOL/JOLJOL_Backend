package com.be.dev.joy.domain.enums;

import lombok.Getter;

@Getter
public enum Crew {
    
    FRIEND("FRIEND"), // 친구
    LOCAL("LOCAL") // 지역
    ;
    
    private final String crew;
    
    Crew(String crew) {
        this.crew = crew;
    }
}
