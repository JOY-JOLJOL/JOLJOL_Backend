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
public class Stroll extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stroll_id")
    private Long id; // 산책 기록 고유 ID

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pet_id", nullable = false)
    private MyPet myPet; // 펫 ID

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", nullable = false)
    private Member member; // 사용자 고유 ID

    @Column(name = "total_time")
    @ColumnDefault("0")
    private Long totalTime; // 산책 시간

    @Column
    @ColumnDefault("0")
    private Long step; // 걸음 수

    @Column(name = "is_done")
    @ColumnDefault("false")
    private Boolean isDone; // 산책 종료 여부
}
