package com.company;

import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte n = in.nextByte();
        int dec = n / 10;
        String fifty = "L", five = "V", ten = "X", one = "I";
        if (dec > 0 && dec < 4) System.out.print(ten.repeat(dec));
        else if (dec == 4) System.out.print("XL");
        else if (dec > 4 && dec < 9) System.out.print(fifty.concat(ten.repeat(dec - 5)));
        else if (dec == 9) System.out.print("XC");
        else if (dec == 10) System.out.print("C");

        int ed = n % 10;
        if (ed > 0 && ed < 4) System.out.println(one.repeat(ed));
        else if (ed == 4) System.out.println("IV");
        else if (ed > 4 && ed < 9) System.out.println(five.concat(one.repeat(ed - 5)));
        else if (ed == 9) System.out.println("IX");
    }
}
