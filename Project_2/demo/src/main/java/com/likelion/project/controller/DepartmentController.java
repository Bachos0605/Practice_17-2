package com.likelion.project.controller;


import com.likelion.project.dto.DepartmentDto;
import com.likelion.project.service.DepartmentService;
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
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/Validate")
    public ResponseEntity<DepartmentDto> testValidDepartmentDto(@RequestBody @Valid DepartmentDto departmentDto){
        departmentService.getDepartmentDto(departmentDto);
        return new ResponseEntity<>(departmentDto, HttpStatus.OK);
    }
}
