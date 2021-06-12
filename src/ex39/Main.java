package ex39;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner kb= new Scanner(System.in);
        ArrayList<String> firstName= new ArrayList<String>();
        ArrayList<String> lastName= new ArrayList<String>();
        ArrayList<String> position= new ArrayList<String>();
        ArrayList<String> sepDate= new ArrayList<String>();
        System.out.println("Enter all first names in order.");
        for(int i=0;i<6;i++){
            firstName.add(kb.nextLine());
        }
        System.out.println("Enter all last names in order.");
        for(int i=0;i<6;i++){
            lastName.add(kb.nextLine());
        }
        System.out.println("Enter all positions in order.");
        for(int i=0;i<6;i++){
            position.add(kb.nextLine());
        }
        System.out.println("Enter all separation dates in order.");
        for(int i=0;i<6;i++){
            sepDate.add(kb.nextLine());
        }
        Collections.sort(lastName);
        for(int i=0;i<6;i++){
            System.out.println(firstName.get(i));
        }
        for(int i=0;i<6;i++){
            System.out.println(lastName.get(i));
        }
        for(int i=0;i<6;i++){
            System.out.println(position.get(i));
        }
        for(int i=0;i<6;i++){
            System.out.println(position.get(i));
        }
    }
}
