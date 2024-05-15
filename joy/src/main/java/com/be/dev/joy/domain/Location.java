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
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stroll_id")
    private Long id; // 산책 기록 고유 ID

    @Column(nullable = false)
    private String one; // 동네1

    @Column
    private String two; // 동네2

    @Column
    private String three; // 동네3
}
