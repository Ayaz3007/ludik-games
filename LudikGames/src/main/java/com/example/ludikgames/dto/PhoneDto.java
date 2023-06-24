package com.example.ludikgames.dto;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PhoneDto {
    @Size(min = 11, max = 11)
    private String phoneNumber;
}
