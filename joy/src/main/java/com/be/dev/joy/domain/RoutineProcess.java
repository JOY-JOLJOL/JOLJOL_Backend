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
public class RoutineProcess {

    @Id
    @Column
    private Integer week; // 주차

    @Id
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "routine_id")
    private Routine routine; // 스낵루틴 고유 ID
    
    @Column
    private Integer stat; // 이번 주 달성 수치
}
