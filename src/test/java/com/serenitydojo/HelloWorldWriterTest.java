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

        //Exercise 2 - Converting to upper case
        String fName= "  Suresh Hebbal ";
        String upperCase = fName.toUpperCase(Locale.ROOT);
        System.out.println("uppercase string is:"+upperCase);

        //Exercise 1 - Converting to lower case
        String lowerCase = fName.toLowerCase(Locale.ROOT);
        System.out.println("lowercase string is:"+lowerCase);

        //Exercise 5 - Replacing text in a string
        String replaceString = fName.replace("Suresh", "Kallesh");
        System.out.println("replaced string is:"+replaceString);

        //Exercise 4 - Finding the length of a string
        System.out.println(fName.length());

        //Exercise 3 - Trim extra space
        System.out.println(fName.trim());
    }
}
