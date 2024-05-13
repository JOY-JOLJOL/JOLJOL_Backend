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
public class RoutineMember {

    @Id
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "routine_id")
    private Routine routine; // 스낵루틴 고유 ID

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member; // 사용자 고유 ID

    @Column(name = "is_closed")
    private Boolean isClosed; // 루틴 종료 여부

    @Column
    private Integer contribution; // 기여도

    @Column(name = "is_rewarded")
    private Boolean isRewarded; // 보상 수령 여부
}
