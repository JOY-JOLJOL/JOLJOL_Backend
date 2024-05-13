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
public class Stroll extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stroll_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pet_id")
    private MyPet myPet; // 펫 ID

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member; // 사용자 고유 ID

    @Column(name = "total_time")
    private Long totalTime; // 산책 시간

    @Column
    private Long step; // 걸음 수

    @Column(name = "is_done")
    private Boolean isDone; // 산책 종료 여부
}
