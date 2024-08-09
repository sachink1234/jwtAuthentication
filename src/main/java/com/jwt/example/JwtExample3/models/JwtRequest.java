package com.jwt.example.JwtExample3.models;

import lombok.*;
import org.springframework.web.bind.annotation.BindParam;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JwtRequest {
private String email;
private String password;
}
