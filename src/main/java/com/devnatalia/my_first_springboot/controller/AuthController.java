package com.devnatalia.my_first_springboot.controller;

import com.devnatalia.my_first_springboot.model.User;
import com.devnatalia.my_first_springboot.security.JwtUtil;
import com.devnatalia.my_first_springboot.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UserService userService;

    public AuthController(UserService userServise) {
        this.userService = userServise;
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody Map<String, String> request) {
        User user = userService.registerUser(request.get("username"), "password");
        return ResponseEntity.ok(user);
    }

    @PostMapping("/login")
    public ResponseEntity<?> username(@RequestBody Map<String, String> request) {
        Optional<User> user = userService.findByUsername(request.get("username"));
        if (user.isPresent() && user.get().getPassword().equals(request.get("password"))) {
            String token = JwtUtil.generateToken(user.get().getUsername());
            return ResponseEntity.ok(Map.of("token", token));
        }
        return  ResponseEntity.status(401).body("Invalid credentials");
    }
}
