package com.likelion.project.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
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

    private List<EmployeeDto> EmployeedDtoList;

}

