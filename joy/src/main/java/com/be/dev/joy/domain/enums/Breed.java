package com.be.dev.joy.domain.enums;

import lombok.Getter;

@Getter
public enum Breed {

    DACHSHUND("DACHSHUND", "닥스훈트"),
    BEAGLE("BEAGLE", "비글"),
    POMERANIAN("POMERANIAN", "포메라니안"),
    DALMATIAN("DALMATIAN", "달마시안"),
    HUSKY("HUSKY", "시베리안 허스키"),
    POODLE("POODLE", "스탠다드 푸들")
    ;

    private final String breed;
    private final String title;

    Breed(String breed, String title) {
        this.breed = breed;
        this.title = title;
    }
}
