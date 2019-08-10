package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float intrestRate;
        int period,principal;
        double mortage;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Principal: ");
        principal=scanner.nextInt();
        System.out.print("Annual Interest: ");
        intrestRate=scanner.nextFloat();
        System.out.print("Period: ");
        period=scanner.nextInt();
        mortage = principal*((intrestRate*(Math.pow(1+intrestRate,period)))/(Math.pow(1+intrestRate,period)-1));
        System.out.println("Mortage : "+ NumberFormat.getCurrencyInstance().format(mortage));

    }
}
