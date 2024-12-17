package com.vimal.code.ToDo.dto.resp;

import lombok.*;

@Getter
@Setter



@Builder
@ToString
public class JwtResponse {
    private String token;
    private String refreshToken;

    public JwtResponse(String token, String refreshToken) {
        this.token = token;
        this.refreshToken = refreshToken;
    }
}
