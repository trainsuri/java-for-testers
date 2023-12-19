package com.serenitydojo.dataTypes;

import org.junit.Test;

public class WhenWorkingWithFloatingPointNumbers {

    //Converting a number from celcius to farenheit
    @Test

    public void convertCelciusToFarenheit(){

        float celcius=36.5f;

        float farenheit = (celcius*9/5)+32;
        System.out.println("float conversion value for Celcius:=" +farenheit);
    }

    @Test

    public void convertKgToPounds(){

        float kg=2.0f;

        float pound = kg*2.205f;
        System.out.println("Pound value:="+pound);

    }
}
