package com.likelion.project.controller;

import com.likelion.project.Dto.EmployeeDto;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EmployeeController {
   @PostMapping("/test")
    public ResponseEntity<EmployeeDto> testValidEmployeeDto(@RequestBody @Valid EmployeeDto employeeDto){
        return new ResponseEntity<>(employeeDto, HttpStatus.OK);
   }
}
