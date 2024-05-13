package com.be.dev.joy.domain;

import com.be.dev.joy.domain.enums.Stamp;
import com.be.dev.joy.domain.enums.Weather;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Diary extends BaseTimeEntity {

    @Id
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stroll_id")
    private Stroll stroll; // 산책 기록 고유 ID

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member; // 사용자 고유 ID

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pet_id")
    private MyPet myPet;

    @Column(name = "card_img_url")
    private String cardImgUrl; // 산책카드 img

    @Column
    private String content; // 일기 내용

    @Enumerated(value = EnumType.STRING)
    @Column
    private Stamp stamp; // 스탬프

    @Enumerated(value = EnumType.STRING)
    @Column
    private Weather weather; // 날씨
}
