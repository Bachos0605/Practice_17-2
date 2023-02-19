package com.likelion.project.service;

import com.likelion.project.dto.EmployeeDto;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {
    EmployeeDto getEmployeeDto(EmployeeDto employeeDto) throws Exception;
}
