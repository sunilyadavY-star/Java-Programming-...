package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myValue =10000;
        int myMinvalue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;
        System.out.println(" Integer Minimum Value =" + myMinvalue);
        System.out.println(" Integer Maximum Value =" + myMaxValue);
        System.out.println(" Busted Max Value= " +(myMaxValue +1));
        System.out.println(" Busted Min Value =" + (myMinvalue -1));
        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println(" Byte Min Value =" + myMinByteValue);
        System.out.println(" Byte Max value ="+ myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println(" short Min Value =" + myMinShortValue);
        System.out.println(" short Max value ="+ myMaxShortValue);

        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println(" long Min Value =" + myMinLongValue);
        System.out.println(" long Max value ="+ myMaxLongValue);
        long bigLongLitralVariable = 2_147_483_6474L;
        System.out.println(bigLongLitralVariable);

        short bigShortLitralValue =32767;

        int myTotal = (myMinvalue /2);

        byte myNewByteValue =(byte) (myMinByteValue /2);

        short myNewShortValue =(short) (myMinShortValue /2);


    }
}
