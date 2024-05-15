package com.be.dev.joy.domain;

import com.be.dev.joy.domain.enums.Breed;
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
public class PetData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pet_data_id")
    private Long petDataId; // 펫정보 고유 ID

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Breed breed; // 견종

    @Column(length = 500, name = "img_url", nullable = false)
    private String imgUrl; // 이미지
}
