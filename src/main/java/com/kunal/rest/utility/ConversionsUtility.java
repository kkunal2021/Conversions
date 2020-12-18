package com.kunal.rest.utility;

import java.util.function.Function;

/**
 * @author kunal
 */

public class ConversionsUtility {

    private ConversionsUtility() {
    };

    public static final Function<Double, Double> C2K = c -> c + 273.15;
    public static final Function<Double, Double> K2C = k -> k - 273.15;

    public static final Function<Double, Double> M2K = miles -> miles * 1.609344;
    public static final Function<Double, Double> K2M = kilometers -> kilometers / 1.6;

}
