package com.ohgiraffers.familystory.service;

import com.ohgiraffers.familystory.model.User;
import com.ohgiraffers.familystory.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {
    @Autowired
    private UserRepository userRepository;

    public User register(User user) {
        // 비밀번호 암호화 및 사용자 저장 로직
        return userRepository.save(user);
    }

    public User login(String email, String password) {
        // 로그인 로직
        Optional<User> userOptional = userRepository.findByEmail(email);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            // 비밀번호 검증 로직 추가 필요
            return user; // 비밀번호 검증 후 반환
        } else {
            throw new RuntimeException("사용자를 찾을 수 없습니다."); // 사용자 미찾음 예외 처리
        }
    }
}
