package com.serenitydojo;

import org.junit.Test;

import java.util.Locale;

public class HelloWorldWriterTest {

    @Test
    public void shouldWriteHelloWorldToTheConsole(){

        HelloWorldWriter writer = new HelloWorldWriter();
        writer.writeHelloWorld();

    }

    @Test
    public void declareNumericalValues(){

        final int ageThisYear = 42;

        int ageNextYear= ageThisYear+1;
        System.out.println("age="+ageNextYear);

        long starsInGalaxy= 10000000L;
        float pi= 3.14f;
        double piValue=3.1412;
        System.out.println("starsinSky ="+ starsInGalaxy);
        System.out.println("pi in float datatype="+pi);
        System.out.println("pi in double datatype="+piValue);
    }

    @Test
    public void workingWithStrings(){

        String fName= "  Suresh Hebbal ";
        String upperCase = fName.toUpperCase(Locale.ROOT);
        System.out.println("uppercase string is:"+upperCase);

        String lowerCase = fName.toLowerCase(Locale.ROOT);
        System.out.println("lowercase string is:"+lowerCase);

        String replaceString = fName.replace("Suresh", "Kallesh");
        System.out.println("replaced string is:"+replaceString);
        System.out.println(fName.length());
        System.out.println(fName.trim());
    }
}
