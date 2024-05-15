package com.be.dev.joy.domain.pk;

import com.be.dev.joy.domain.Routine;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class RoutineProcessPK implements Serializable {

    @Column(nullable = false)
    private Integer week; // 주차

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "routine_id", nullable = false)
    private Routine routine; // 스낵루틴 고유 ID
}
