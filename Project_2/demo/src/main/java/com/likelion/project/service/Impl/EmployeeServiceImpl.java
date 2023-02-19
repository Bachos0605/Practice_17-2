package com.likelion.project.service.Impl;

import com.likelion.project.dto.EmployeeDto;
import com.likelion.project.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeServiceImpl.class);
    @Override
    public EmployeeDto getEmployeeDto(EmployeeDto employeeDto) throws Exception {
        LOGGER.info(employeeDto.toString());

        if(employeeDto.getName().equals("Wrong!")){
            throw new Exception("Wrong!");
        }
        return employeeDto;
    }
}
