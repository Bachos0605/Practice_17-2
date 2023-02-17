package com.likelion.project.controller;

import com.likelion.project.Dto.DepartmentDto;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DepartmentController {
    @PostMapping("/Validate")
    public ResponseEntity<DepartmentDto> testValidDepartmentDto(@RequestBody @Valid DepartmentDto departmentDto){
        return new ResponseEntity<>(departmentDto, HttpStatus.OK);
    }
}
