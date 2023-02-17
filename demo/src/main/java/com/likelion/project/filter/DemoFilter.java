package com.likelion.project.filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.logging.Logger;

@Component
public class DemoFilter {
    private Logger logger = (Logger) LoggerFactory.getLogger(DemoFilter.class);

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        String browser = httpServletRequest.getHeader("User-Agent");

        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
        httpServletResponse.addHeader("Custom-Header", "This is a custom header");
        httpServletResponse.setContentType("application/json");

        String responseBody = "";

        if (browser != null && false && browser.contains("Postman") && !httpServletResponse.isCommitted()) {
            httpServletResponse.setStatus(403);
            responseBody = "{ \"message\": \"You're requesting from Postman!\" }";
        } else {
            responseBody = "{ \"message\": \"You're requesting from " + browser + "\" }";
        }

        logger.info("Inside doFilter()");

        httpServletResponse.getOutputStream().print(responseBody);

        filterChain.doFilter(httpServletRequest, httpServletResponse);
    }
}
