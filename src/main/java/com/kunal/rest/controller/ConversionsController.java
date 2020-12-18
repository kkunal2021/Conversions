package com.kunal.rest.controller;

import com.kunal.rest.models.ConversionsDto;
import com.kunal.rest.service.ICelsiusToKelvinViceVersa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kunal
 */

@RestController
@RequestMapping(value = "/conversions")
public class ConversionsController {

    public static final String RESULT = "result";

    @Qualifier("celsiusToKelvinViceVersaServiceImpl")
    @Autowired
    ICelsiusToKelvinViceVersa iCelsiusToKelvinViceVersa;

    @PostMapping(value = "/ctok")
    public Map<String, Double> convertCelsiusToKelvin(@RequestBody ConversionsDto converter) {
        Map<String, Double> ctokMap = new HashMap<>();
        Double ctokResult = iCelsiusToKelvinViceVersa.convertCelsiusToKelvin(converter.getType(), converter.getValue());
        ctokMap.put(ConversionsController.RESULT, ctokResult);
        return ctokMap;
    }

    @PostMapping(value = "/ktoc")
    public Map<String, Double> convertKelvinToCelsius(@RequestBody ConversionsDto converter) {
        Map<String, Double> ktocMap = new HashMap<>();
        Double ktocResult = iCelsiusToKelvinViceVersa.convertCelsiusToKelvin(converter.getType(), converter.getValue());
        ktocMap.put(ConversionsController.RESULT, ktocResult);
        return ktocMap;
    }


}
