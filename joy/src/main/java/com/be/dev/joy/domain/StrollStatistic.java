package com.be.dev.joy.domain;

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
public class StrollStatistic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stroll_statistic_id")
    private Long id; // 산책 기록 통계 고유 ID

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pet_id")
    private MyPet myPet; // 펫 ID

    @Column
    private Integer year; // 연
    
    @Column
    private Integer month; // 월
    
    @Column
    private Integer count; // 운동 횟수
    
    @Column
    private Integer step; // 걸음 수
}
