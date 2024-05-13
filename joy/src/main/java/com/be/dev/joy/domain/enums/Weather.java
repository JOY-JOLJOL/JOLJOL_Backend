package com.be.dev.joy.domain.enums;

import lombok.Getter;

@Getter
public enum Weather {

    SUNNY_DAY("SUNNY_DAY"), // 맑음(낮)
    SUNNY_NIGHT("SUNNY_NIGHT"), // 맑음(밤)
    BAD("BAD"), // 흐림
    RAIN("RAIN"), // 비
    SNOW("SNOW"), // 눈
    WINDY("WINDY"), // 바람
    CLOUDY_DAY("CLOUDY_DAY"), // 구름조금(낮)
    CLOUDY_NIGHT("CLOUDY_NIGHT"), // 구름조금(밤)

    ;

    private final String weather;

    Weather(String weather) {
        this.weather = weather;
    }

}
