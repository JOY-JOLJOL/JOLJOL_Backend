package com.be.dev.joy.domain;

import com.be.dev.joy.domain.pk.RoutineProcessPK;
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
public class RoutineProcess {

    @EmbeddedId
    private RoutineProcessPK routineProcessPK; // 복합키(주차, 스낵루틴 고유 ID)
    
    @Column
    @ColumnDefault("0")
    private Integer stat; // 이번 주 달성 수치
}
