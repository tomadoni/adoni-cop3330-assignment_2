package ex24;

import java.util.Scanner;

public class Main {

    public static boolean isAnagram(String a, String b){
        int c=0;
        if(a.length()!=b.length()){
            return false;
        }
        else{
            for(int i=0;i<a.length();i++){
                for(int j=0;j<b.length();j++){
                    if(a.substring(i,i+1).equals(b.substring(j,j+1))){
                        c++;
                    }
                }
            }
        }
        if(c==a.length()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner kb= new Scanner(System.in);
        String a ="";
        String b ="";
        System.out.println("Enter two strings and I will tell you if they're anagrams:");
        System.out.println("Enter the first string: ");
        a= kb.nextLine();
        System.out.println("Enter the second string: ");
        b= kb.nextLine();
        if(isAnagram(a,b)==true){
            System.out.println("'"+a+"'"+" and '"+b+"'"+" are anagrams.");
        }
        else{
            System.out.println("'"+a+"'"+" and '"+b+"'"+" are not anagrams.");
        }
    }
}