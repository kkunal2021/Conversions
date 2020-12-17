package com.kunal.rest.service;

import org.springframework.stereotype.Service;

/**
 * @author kunal
 */

@Service
@FunctionalInterface
public interface ICelsiusToKelvinViceVersa {

    public Double convertCelsiusToKelvin(String type, double value);
}
