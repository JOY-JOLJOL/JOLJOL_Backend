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
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

import java.time.LocalDateTime;

@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@DynamicInsert
public class Routine extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "routine_id")
    private Long id; // 스낵루틴 고유 ID

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", nullable = false)
    private Member member; // 사용자 고유 ID(방장)

    @Enumerated(EnumType.STRING)
    @Column
    @ColumnDefault("OPEN")
    private Status status; // 진행 상태

    @Column(nullable = false)
    private String title; // 루틴 제목

    @Column
    private String content; // 루틴 상세 설명

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Mode mode; // 루틴 모드

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Goal goal; // 목표 항목

    @Column(name = "goal_value", nullable = false)
    private Integer goalValue; // 목표 수치

    @Column(name = "goal_mem", nullable = false)
    private Integer goalMem; // 모집 인원

    @Column(nullable = false)
    private Integer term; // 목표 기간(주)

    @Column(name = "date_start", nullable = false)
    private LocalDateTime dateStart; // 시작일

    @Column(name = "date_end", nullable = false)
    private LocalDateTime dateEnd; // 종료일

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Crew crew; // 함께하는 집단

    @Column
    @ColumnDefault("0")
    private Integer persons; // 현재 인원

    @Column
    private String location; // 동네

    @Column(nullable = false)
    private Integer reward; // 보상
}
