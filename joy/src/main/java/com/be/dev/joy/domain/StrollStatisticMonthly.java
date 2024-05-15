package com.be.dev.joy.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StrollStatisticMonthly {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stroll_statistic_id")
    private Long id; // 산책 기록 통계 고유 ID

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pet_id", nullable = false)
    private MyPet myPet; // 펫 ID

    @Column(nullable = false)
    private Integer year; // 연
    
    @Column(nullable = false)
    private Integer month; // 월
    
    @Column
    @ColumnDefault("0")
    private Long count; // 운동 횟수
    
    @Column
    @ColumnDefault("0")
    private Long step; // 걸음 수
}
