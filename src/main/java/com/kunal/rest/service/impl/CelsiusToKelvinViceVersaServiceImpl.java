package com.kunal.rest.service.impl;

import com.kunal.rest.service.ICelsiusToKelvinViceVersa;
import com.kunal.rest.utility.ConversionsUtility;
import org.springframework.stereotype.Service;

/**
 * @author kunal
 */

@Service
public class CelsiusToKelvinViceVersaServiceImpl implements ICelsiusToKelvinViceVersa {

    @Override
    public Double convertCelsiusToKelvin(String type, double value) {
        return "c2k".equals(type) ? ConversionsUtility.C2K.apply(value) : ConversionsUtility.K2C.apply(value);
    }
}
