package ex26;

import java.util.Scanner;

import java.lang.Math;

import static java.lang.Math.log;

public class PaymentCalculator {
    public static double calculateMonthsUntilPaidOff(double i, double b, double p){
        double n = (-(1/30) * log(1 + b/p * (1 - Math.pow((1 + i),30))) / log(1 + i));
        return n;
    }

    public static void main(String[] args){
        Scanner kb= new Scanner(System.in);
        double i=0;
        double b=0;
        double p=0;
        double result=0;
        System.out.println("What is your balance?");
        b= kb.nextInt();
        System.out.println("What is the APR on the card (as a percent)?");
        i= kb.nextDouble();
        i/=100;
        i/=365;
        System.out.println("What is the monthly payment you can make?");
        p= kb.nextInt();
        result=calculateMonthsUntilPaidOff(i,b,p);
        System.out.println("It will take you "+result+" months to pay off this card");
    }
}
