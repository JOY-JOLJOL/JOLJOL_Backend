package com.be.dev.joy.domain;

import com.be.dev.joy.domain.enums.Channel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;

@Slf4j
@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Member {

    @Id
    @Column(name = "member_id")
    private String id; // 사용자가 입력하는 고유 ID
    
    @Column(length = 255)
    private String email; // 이메일
    
    @Column(length = 18)
    private String password; // 비밀번호

    @Enumerated(EnumType.STRING)
    @Column
    private Channel channel;
    
    @Column(name = "is_informed")
    private Boolean isInformed; // 추가 정보 설정 여부
    
    @Column(name = "is_onboard")
    private Boolean isOnboard; // 온보딩 수행 여부

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
