package com.kunal.rest.models;

/**
 * @author kunal
 */

public class ConversionsDto {

    double value;
    String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ConversionsDto [value=" + value + ", type=" + type + "]";
    }
}
