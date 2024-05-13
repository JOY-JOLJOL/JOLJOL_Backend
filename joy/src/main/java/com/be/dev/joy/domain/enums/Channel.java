package com.be.dev.joy.domain.enums;

import lombok.Getter;

@Getter
public enum Channel {
    
    GOOGLE("GOOGLE"), // 구글
    APPLE("APPLE"), // 애플
    KAKAO("KAKAO"), // 카카오
    JOLJOL("JOLJOL"), // 자체로그인
    ;
    
    private final String channel;
    
    Channel(String channel) {
        this.channel = channel;
    }
}
