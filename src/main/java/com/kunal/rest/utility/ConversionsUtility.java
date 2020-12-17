package com.kunal.rest.utility;

import java.util.function.Function;

/**
 * @author kunal
 */

public class ConversionsUtility {

    private ConversionsUtility() {
    };

    public static final Function<Double, Double> C2K = c -> c + 273.15;

}
