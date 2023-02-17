package com.likelion.project.service.Impl;

import com.likelion.project.Dto.EmployeeDto;
import com.likelion.project.service.EmployeeService;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public EmployeeDto getEmployeeDto(EmployeeDto employeeDto) {
        //Create exception for test logging
        if(employeeDto.getEmployeeID() == 0) {
            try {
                throw new Exception("Id can't be zero");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return employeeDto;
    }
}
