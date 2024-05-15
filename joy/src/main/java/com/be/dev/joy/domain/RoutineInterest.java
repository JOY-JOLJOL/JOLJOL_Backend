package com.be.dev.joy.domain;

import com.be.dev.joy.domain.pk.RoutineInterestPK;
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
public class RoutineInterest {

    @EmbeddedId
    private RoutineInterestPK routineInterestPK; // 복합키(사용자 고유 ID, 스낵루틴 고유 ID)
}
