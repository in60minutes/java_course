package com.in60minutes.basics;

public class TypeCasting01 {
    public static void main(String[] args) {
        // Explicte Casting
        /**
         * Narrowing Casting (manually) - converting a larger type to a smaller size type
         * double -> float -> long -> int -> char -> short -> byte
         */
        int a = 298;
        byte b = (byte) a;
        System.out.println(b);

        //Implicite Casting
        /**
         * Widening Casting (automatically) - converting a smaller type to a larger type size
         * byte -> short -> char -> int -> long -> float -> double
         */
        byte c = 23;
        int d = c;
        System.out.println(d);

    }
}
