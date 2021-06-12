package ex28;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner kb= new Scanner(System.in);
        int num=0;
        int sum=0;
        for(int i=0;i<5;i++){
            System.out.println("Enter a number:");
            num= kb.nextInt();
            sum+=num;
            num=0;
        }
        System.out.println("The total is "+sum+".");
    }
}
