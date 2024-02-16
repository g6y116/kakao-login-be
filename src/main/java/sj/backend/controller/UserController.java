package sj.backend.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sj.backend.dto.KakaoUserDto;
import sj.backend.service.UserService;

@Slf4j
@RestController
@RequestMapping("/api/kakao")
@RequiredArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {

    private final UserService userService;

    @RequestMapping("/login")
    public ResponseEntity<String> kakaoLogin(@RequestParam("code") String code) {
        return ResponseEntity.ok(userService.kakaoLogin(code));
    }

    @RequestMapping("/info")
    public ResponseEntity<KakaoUserDto> getKakaoUser(@RequestHeader("Authorization") String token) {
        return ResponseEntity.ok(userService.getKakaoUserDtoByServerToken(token));
    }
}