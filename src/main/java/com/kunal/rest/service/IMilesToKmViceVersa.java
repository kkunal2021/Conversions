package com.kunal.rest.service;

import org.springframework.stereotype.Service;

/**
 * @author kunal
 */

@Service
@FunctionalInterface
public interface IMilesToKmViceVersa {
    public Double convertMilesToKmViceVersa(String type, double value);
}
