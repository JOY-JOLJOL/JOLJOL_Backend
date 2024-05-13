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
public class StrollWith {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 함께하는 산책 고유 ID

    @Id
    @OneToOne(fetch = FetchType.LAZY)
    private Stroll stroll; // 산책 기록 고유 ID
}
