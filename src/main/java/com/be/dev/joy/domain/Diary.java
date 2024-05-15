package com.be.dev.joy.domain;

import com.be.dev.joy.domain.enums.Stamp;
import com.be.dev.joy.domain.enums.Weather;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@DynamicInsert
public class Diary extends BaseTimeEntity {

    @Id
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stroll_id")
    private Stroll stroll; // 산책 기록 고유 ID

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false, name = "member_id")
    private Member member; // 사용자 고유 ID

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false, name = "pet_id")
    private MyPet myPet; // 펫 ID

    @Column(nullable = false, name = "card_img_url")
    private String cardImgUrl; // 산책카드 img

    @Column(nullable = false)
    private String content; // 일기 내용

    @Enumerated(value = EnumType.STRING)
    @Column
    @ColumnDefault("WELL_DONE")
    private Stamp stamp; // 스탬프

    @Enumerated(value = EnumType.STRING)
    @Column
    private Weather weather; // 날씨
}
