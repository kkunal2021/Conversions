package com.kunal.rest.controller;

import com.kunal.rest.models.ConversionsDto;
import com.kunal.rest.service.ICelsiusToKelvinViceVersa;
import com.kunal.rest.service.IMilesToKmViceVersa;
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

    public static final String CONVERSION_RESULTS = "conversionsResult";

    @Qualifier("celsiusToKelvinViceVersaServiceImpl")
    @Autowired
    ICelsiusToKelvinViceVersa iCelsiusToKelvinViceVersa;

    @Qualifier("milesToKmViceVersaServiceImpl")
    @Autowired
    IMilesToKmViceVersa iMilesToKmViceVersa;

    @PostMapping(value = "/ctok")
    public Map<String, Double> convertCelsiusToKelvin(@RequestBody ConversionsDto converter) {
        Map<String, Double> ctokMap = new HashMap<>();
        Double ctokResult = iCelsiusToKelvinViceVersa.convertCelsiusToKelvin(converter.getType(), converter.getValue());
        ctokMap.put(ConversionsController.CONVERSION_RESULTS, ctokResult);
        return ctokMap;
    }

    @PostMapping(value = "/ktoc")
    public Map<String, Double> convertKelvinToCelsius(@RequestBody ConversionsDto converter) {
        Map<String, Double> ktocMap = new HashMap<>();
        Double ktocResult = iCelsiusToKelvinViceVersa.convertCelsiusToKelvin(converter.getType(), converter.getValue());
        ktocMap.put(ConversionsController.CONVERSION_RESULTS, ktocResult);
        return ktocMap;
    }

    @PostMapping(value = "/mtok")
    public Map<String, Double> convertMilesToKilometer(@RequestBody ConversionsDto converter) {
        Map<String, Double> mtokMap = new HashMap<>();
        Double mtokResult = iMilesToKmViceVersa.convertMilesToKmViceVersa(converter.getType(), converter.getValue());
        mtokMap.put(ConversionsController.CONVERSION_RESULTS, mtokResult);
        return mtokMap;
    }

    @PostMapping(value = "/ktom")
    public Map<String, Double> convertKilometerToMiles(@RequestBody ConversionsDto converter) {
        Map<String, Double> ktomMap = new HashMap<>();
        Double ktomResult = iMilesToKmViceVersa.convertMilesToKmViceVersa(converter.getType(), converter.getValue());
        ktomMap.put(ConversionsController.CONVERSION_RESULTS, ktomResult);
        return ktomMap;
    }

}
