package com.likelion.project.service.Impl;

import com.likelion.project.dto.DepartmentDto;
import com.likelion.project.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class DerparmentServiceImpl implements DepartmentService {
    private static final Logger LOGGER = LoggerFactory.getLogger(DerparmentServiceImpl.class);
    @Override
    public DepartmentDto getDepartmentDto(DepartmentDto departmentDto) {
        LOGGER.info(departmentDto.toString());
        return departmentDto;
    }
}
