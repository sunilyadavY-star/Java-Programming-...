package com.company;

public class Main {

    public static void main(String[] args) {

        float myFloatMinValue =Float.MIN_VALUE;
        float myFloatMaxValue =Float.MAX_VALUE;
        System.out.println("Float minimum value =" +myFloatMinValue);
        System.out.println("Float maximum value ="+myFloatMaxValue);

        double myDoubleMinValue =Double.MIN_VALUE;
        double myDoubleMaxValue =Double.MAX_VALUE;
        System.out.println("double minimum value =" +myDoubleMinValue);
        System.out.println("double maximum value ="+myDoubleMaxValue);

        int myIntValue =5 /3;
        float myFloatValue =5f /3f;
        double myDoubleValue =5d / 3d;
        System.out.println("MyIntValue =" + myIntValue);
        System.out.println("MyFloatValue ="+ myFloatValue);
        System.out.println("MyDoubleValue ="+myDoubleValue);

        double numberOfPounds =200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println(convertedKilograms);
        }

    }

