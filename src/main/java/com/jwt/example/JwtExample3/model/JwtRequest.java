package com.jwt.example.JwtExample3.model;


import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class JwtRequest {
    private String email;
    private String password;

    // Default constructor for JSON Parsing

}
