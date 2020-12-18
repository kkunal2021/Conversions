package com.kunal.rest.service.impl;

import com.kunal.rest.service.IMilesToKmViceVersa;
import com.kunal.rest.utility.ConversionsUtility;
import org.springframework.stereotype.Service;

/**
 * @author kunal
 */

@Service
public class MilesToKmViceVersaServiceImpl implements IMilesToKmViceVersa {

    @Override
    public Double convertMilesToKmViceVersa(String type, double value) {
        return "m2k".equals(type) ? ConversionsUtility.M2K.apply(value) : ConversionsUtility.K2M.apply(value);
    }
}
