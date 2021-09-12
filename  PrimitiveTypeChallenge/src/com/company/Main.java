package com.company;

public class Main {

    public static void main(String[] args) {

	    byte byteValue =10;
        short shortValue =20;
        int intValue =50;

        long longTotal =50000L + 10L *(byteValue+shortValue+intValue);
        System.out.println(longTotal);

        short shortTotal = (byte)(10000 +10 *( byteValue+shortValue+intValue));
        System.out.println(shortTotal);

    }
}
