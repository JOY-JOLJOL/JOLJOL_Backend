package com.be.dev.joy.domain;

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
public class MemberInfo {
    
    @Id
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member; // 사용자 고유 ID
    
    @Column
    private String name; // 이름

    @Column
    private LocalDateTime birth; // 생일

    @Column
    private String location1; // 활동지역1

    @Column
    private String location2; // 활동지역2

    @Column
    private String location3; // 활동지역3
}
