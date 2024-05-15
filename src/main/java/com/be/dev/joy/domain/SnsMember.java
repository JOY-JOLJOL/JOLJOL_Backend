package com.be.dev.joy.domain;

import com.be.dev.joy.domain.enums.Channel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

@Slf4j
@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@DynamicInsert
public class SnsMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sns_member_id")
    private Long id; // sns 가입 사용자 고유 ID

    @Column(name = "auth_id", nullable = false)
    private String authId; // 인증서버 제공 사용자 ID

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Channel channel; // 가입 경로

    @Column(nullable = false)
    private String email; // 이메일

    @Column(nullable = false)
    @ColumnDefault("true")
    private Boolean active; // 활성화여부(가입 시, 비활성화 처리)
}
