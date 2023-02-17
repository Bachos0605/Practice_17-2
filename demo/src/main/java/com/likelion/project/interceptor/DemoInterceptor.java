package com.likelion.project.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.util.logging.Logger;

@Component
public class DemoInterceptor {
    private Logger logger = (Logger) LoggerFactory.getLogger(DemoInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("Pre Handle method is calling");
        request.setAttribute("startTime", System.currentTimeMillis());
        return HandlerInterceptor.super.preHandle(request, response, handler);
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        logger.info("Post Handle method is calling");

        long startTime = (Long) request.getAttribute("startTime");
        long endTime = System.currentTimeMillis();
        long processingTime = endTime - startTime;
        logger.info("Request processing time: {} ms", processingTime);

        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        logger.info("Request and Response are completed");
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
