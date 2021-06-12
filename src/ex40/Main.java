package ex40;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner kb= new Scanner(System.in);
        String str="";
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
        System.out.println("Enter a search string: ");
        str= kb.nextLine();
        System.out.println("Results: ");
        for(int i=0;i<6;i++){
            if(firstName.get(i).contains(str)){
                System.out.println(firstName.get(i));
            }
        }
        for(int i=0;i<6;i++){
            if(lastName.get(i).contains(str)){
                System.out.println(lastName.get(i));
            }
        }
        for(int i=0;i<6;i++){
            if(position.get(i).contains(str)){
                System.out.println(position.get(i));
            }
        }
        for(int i=0;i<6;i++){
            if(sepDate.get(i).contains(str)){
                System.out.println(sepDate.get(i));
            }
        }
    }
}
