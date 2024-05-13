package com.be.dev.joy.domain;

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
public class MyTitle extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "my_title_id")
    private Long id; // 타이틀 고유 ID

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pet_id", nullable = false)
    private MyPet myPet;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "title_data_id", nullable = false)
    private TitleData titleData; // 도전과제 고유 ID

    @Column
    @ColumnDefault("0")
    private Integer done; // 달성 횟수

    @Column(name = "is_achived")
    @ColumnDefault("false")
    private Boolean isAchived; // 획득 여부
}
