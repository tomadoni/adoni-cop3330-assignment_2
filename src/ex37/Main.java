package ex37;

import java.util.Scanner;

import java.util.Random;

public class Main {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int minLength=0;
        int special=0;
        int num=0;
        System.out.println("What's the minimum length?");
        minLength= kb.nextInt();
        System.out.println("How many special characters?");
        special= kb.nextInt();
        System.out.println("How many numbers?");
        num= kb.nextInt();
        String password="";
        Random r = new Random();

        String alphabet = "123xyz";
        for (int i = 0; i < 50; i++) {
            System.out.println(alphabet.charAt(r.nextInt(alphabet.length())));
        } // prints 50 random characters from alphabet
    }
}
