package com.likelion.project.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import java.util.logging.Logger;

@Configuration
@Aspect
public class DemoLogger {
    private Logger logger = (Logger) LoggerFactory.getLogger(DemoLogger.class);

    @Before("execution(* com.likelion.project.service.DepartmentService.getDepartmentDto(..))")
    public void beforeCallDepartmentService(JoinPoint joinPoint){
        logger.info("Before called method " + joinPoint.toString());
    }

    @After("execution(* com.likelion.project.service.DepartmentService.getDepartmentDto(..))")
    public void afterCallDepartmentService(JoinPoint joinPoint) {
        logger.info("After called method " + joinPoint.toString());
    }

    @AfterThrowing("execution(* com.likelion.project.service.EmployeeService.*(..))")
    public void afterCallEmployeeServiceUnSuccess(JoinPoint joinPoint) {
        logger.info("After call failed method: " + joinPoint.toString());
    }
}
