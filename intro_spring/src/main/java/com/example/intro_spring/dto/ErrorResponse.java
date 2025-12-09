package com.example.intro_spring.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class ErrorResponse {
    String error;
    String detail;
}
