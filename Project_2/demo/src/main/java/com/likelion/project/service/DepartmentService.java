package com.likelion.project.service;

import com.likelion.project.dto.DepartmentDto;
import org.springframework.stereotype.Service;

@Service
public interface DepartmentService {
    DepartmentDto getDepartmentDto(DepartmentDto departmentDto);
}
