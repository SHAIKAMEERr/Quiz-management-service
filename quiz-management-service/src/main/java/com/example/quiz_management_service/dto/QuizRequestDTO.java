package com.example.quiz_management_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuizRequestDTO {
    private String title;
    private String description;
    private Long categoryId;
}