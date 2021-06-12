package ex33;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner kb= new Scanner(System.in);
        String[] a={"Yes","No","Maybe","Ask again later"};
        String question="";
        int randNum= (int)(Math.random() * 3);
        System.out.println("What's your question?");
        question= kb.nextLine();
        System.out.println(a[randNum]);
    }
}
