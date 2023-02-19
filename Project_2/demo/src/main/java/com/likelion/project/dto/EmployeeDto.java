package com.likelion.project.dto;

import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {
    private Long employeeID;

    @NotBlank(message = "10 <= Value <= 50")
    @Size(min = 10, max = 50)
    private String name;

    private String birthDate;
    private String gender;

    @Email(regexp = "^[a-zA-Z0-9._%+-]+@gmail.com$")
    @NotEmpty(message = "Email cannot be empty")
    private String email;
}


