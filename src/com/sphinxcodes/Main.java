package com.sphinxcodes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the Principal amount: ");
        double principal = console.nextDouble();

        System.out.print("Enter the rate of interest: ");
        double rate = console.nextDouble();

        rate = (rate/ 100) / 12;

        System.out.println("Enter the time period in years: ");
        int time = console.nextInt();
        time = time * 12;

        double p = (principal * rate) / (1 - Math.pow(1 + rate, - time));
        System.out.println("payments: " + p);
    }
}
