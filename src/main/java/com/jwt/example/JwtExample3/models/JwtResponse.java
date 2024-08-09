package com.jwt.example.JwtExample3.models;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class JwtResponse {

    private String username;
    private String jwtToken;

}
