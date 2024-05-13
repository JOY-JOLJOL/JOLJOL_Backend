package com.be.dev.joy.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

import java.util.UUID;

@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@DynamicInsert
public class MyPet {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "pet_id")
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "title_data_id", nullable = false)
    private TitleData titleData; // 대표 타이틀 ID(도전과제 고유 ID)

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pet_data_id", nullable = false)
    private PetData petData; // 펫정보 고유 ID

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", nullable = false)
    private Member member; // 사용자 고유 ID

    @Column(length = 8, nullable = false)
    private String name; // 강아지 이름

    @Column
    @ColumnDefault("0")
    private Integer level; // 레벨

    @Column(name = "count_title")
    @ColumnDefault("0")
    private Integer countTitle; // 보유 타이틀 개수
}
