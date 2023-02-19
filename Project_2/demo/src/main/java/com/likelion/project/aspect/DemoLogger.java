package com.likelion.project.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class DemoLogger {
    private Logger LOGGER = LoggerFactory.getLogger(DemoLogger.class);

    @Before(value = "execution(* com.likelion.project.service.DepartmentService.getDepartmentDto(..))")
    public void beforeCallDepartmentService(JoinPoint joinPoint) {
        LOGGER.info("Before called " + joinPoint.toString());
    }

    @After(value = "execution(* com.likelion.project.service.DepartmentService.getDepartmentDto(..))")
    public void afterCallDepartmentService(JoinPoint joinPoint) {
        LOGGER.info("After called " + joinPoint.toString());
    }

    @AfterThrowing(value = "execution(* com.likelion.project.service.EmployeeService.getEmployeeDto(..))")
    public void afterCallFailToCallEmployeeService(JoinPoint joinPoint) {
        LOGGER.info("After failed to call  " + joinPoint.toString());
    }
}
