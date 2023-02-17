package com.likelion.project.service.Impl;

import com.likelion.project.Dto.DepartmentDto;
import com.likelion.project.service.DepartmentService;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class DeparmentServiceImpl implements DepartmentService {
    @Override
    public DepartmentDto getDepartmentDto(DepartmentDto departmentDto) {
        return departmentDto;
    }
}
