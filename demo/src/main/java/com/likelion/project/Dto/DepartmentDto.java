package com.likelion.project.Dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDto {
    private Long departmentID;

    @NotBlank(message = "10 <= Value <= 50")
    @Size(min = 10, max = 50)
    private String deptname;

    @NotEmpty(message = "Email cannot be empty")
    private String description;

    @Valid
    private List<EmployeeDto> EmployeedDtoList;

}
