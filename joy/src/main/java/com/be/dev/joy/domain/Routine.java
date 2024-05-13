package com.be.dev.joy.domain;

import com.be.dev.joy.domain.enums.Goal;
import com.be.dev.joy.domain.enums.Crew;
import com.be.dev.joy.domain.enums.Mode;
import com.be.dev.joy.domain.enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Routine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "routine_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member; // 사용자 고유 ID(방장)

    @Enumerated(EnumType.STRING)
    @Column
    private Status status; // 진행 상태

    @Column
    private String title; // 루틴 제목

    @Column
    private String content; // 루틴 상세 설명

    @Enumerated(EnumType.STRING)
    @Column
    private Mode mode; // 루틴 모드

    @Enumerated(EnumType.STRING)
    @Column
    private Goal goal; // 목표 항목

    @Column(name = "goal_value")
    private Integer goalValue; // 목표 수치

    @Column(name = "goal_mem")
    private Integer goalMem; // 모집 인원

    @Column
    private Integer term; // 목표 기간(주)

    @Column(name = "date_start")
    private LocalDateTime dateStart; // 시작일

    @Column(name = "date_end")
    private LocalDateTime dateEnd; // 종료일

    @Enumerated(EnumType.STRING)
    @Column
    private Crew crew; // 함께하는 집단

    @Column
    private Integer persons; // 현재 인원

    @Column(nullable = true)
    private String location; // 동네

    @Column
    private Integer reward; // 보상
}
