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
public class TitleData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "title_data_id")
    private Long id; // 도전과제정보 고유 ID

    @Column(length = 50, nullable = false)
    private String header; // 도전과제명

    @Column(length = 50, nullable = false)
    private String body; // 세부 과제 내용

    @Column(nullable = false)
    private Integer goal; // 목표 횟수

    @Column(length = 500, name = "img_url", nullable = false)
    private String imgUrl; // 이미지
}
