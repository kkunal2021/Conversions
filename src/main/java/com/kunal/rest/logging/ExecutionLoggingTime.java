package com.kunal.rest.logging;

import org.springframework.stereotype.Component;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * @author kunal
 *
 */

@Component
public class ExecutionLoggingTime implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        long executionStartTime = System.currentTimeMillis();
        chain.doFilter(request, response);
        long executionDuration = System.currentTimeMillis() - executionStartTime;
        System.out.println("Total Execution Time Taken For Rest APIs Call {} ---  " + executionDuration + " ms ");
    }
}
