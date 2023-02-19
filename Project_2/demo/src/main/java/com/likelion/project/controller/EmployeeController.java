package com.likelion.project.controller;

import com.likelion.project.dto.EmployeeDto;
import com.likelion.project.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/test")
    public ResponseEntity<EmployeeDto> testValidEmployeeDto(@RequestBody @Valid EmployeeDto employeeDto) throws Exception{
        return new ResponseEntity<>(employeeService.getEmployeeDto(employeeDto), HttpStatus.OK);
    }
}
