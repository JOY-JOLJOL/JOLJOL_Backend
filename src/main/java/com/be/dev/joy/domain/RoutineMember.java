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
public class RoutineMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "routine_member_id")
    private int routineMemberId; // 루틴 참여자 고유 ID

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "routine_id", nullable = false)
    private Routine routine; // 스낵루틴 고유 ID

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", nullable = false)
    private Member member; // 사용자 고유 ID

    @Column(name = "is_closed")
    @ColumnDefault("false")
    private Boolean isClosed; // 루틴 종료 여부

    @Column
    @ColumnDefault("0")
    private Integer contribution; // 기여도

    @Column(name = "is_rewarded")
    @ColumnDefault("false")
    private Boolean isRewarded; // 보상 수령 여부
}
