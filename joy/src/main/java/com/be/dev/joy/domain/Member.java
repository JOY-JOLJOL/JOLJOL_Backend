package com.be.dev.joy.domain;

import com.be.dev.joy.domain.enums.Channel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDateTime;
import java.util.Date;

@Slf4j
@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Member extends BaseTimeEntity {

    @Id
    @Column(length = 16, name = "member_id")
    private String id; // 사용자가 입력하는 고유 ID
    
    @Column(nullable = false, length = 320)
    private String email; // 이메일
    
    @Column(nullable = false, length = 18)
    private String password; // 비밀번호

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Channel channel; // 가입 경로

    @Column(name = "is_informed")
    @ColumnDefault("false")
    private Boolean isInformed; // 추가 정보 설정 여부
    
    @Column(name = "is_onboard")
    @ColumnDefault("false")
    private Boolean isOnboard; // 온보딩 수행 여부

    @Column(nullable = false, name = "id_updated_at")
    private LocalDateTime idUpdatedAt; // 최근 아이디 변경일

    /**
     * 비밀번호를 암호화
     * @param passwordEncoder 암호화 할 인코더 클래스
     * @return 변경된 유저 Entity
     */
    public Member encryptPassword(PasswordEncoder encoder) {
        log.info("비밀번호 암호화 함수 진입");

        this.password = encoder.encode(this.password);
        return this;
    }

    /**
     * 비밀번호 확인
     * @param plainPassword 암호화 이전의 비밀번호
     * @param passwordEncoder 암호화에 사용된 클래스
     * @return true | false
     */
    public boolean verifyPassword(String password, PasswordEncoder encoder) {
        return encoder.matches(password, this.password);
    }
}
