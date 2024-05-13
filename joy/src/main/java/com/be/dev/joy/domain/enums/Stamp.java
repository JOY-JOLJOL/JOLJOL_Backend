package com.be.dev.joy.domain.enums;

import lombok.Getter;

@Getter
public enum Stamp {

    NOT_GOOD("NOT_GOOD", "토닥토닥"),
    CHEER_UP("CHEER_UP", "아자아자"),
    WELL_DONE("WELL_DONE", "수고했어"),
    GOOD_BOY("GOOD_BOY", "굿보이"),
    BEST("BEST", "짱!짱!짱!") 
    ;

    private final String stamp;
    private final String title;

    Stamp(String stamp, String title) {
        this.stamp = stamp;
        this.title = title;
    }
}
