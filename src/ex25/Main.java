package ex25;

import java.util.Scanner;

public class Main {

    public static int passwordValidator(String pass){
        int let=0;
        int num=0;
        int special=0;
        String specialCharactersString = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
        for(int i=0;i<pass.length()-1;i++){
            if(Character.isDigit(Integer.parseInt(pass.substring(i,i+1)))){
                num++;
            }
            if((Character.isLetter(pass.charAt(i)))){
                let++;
            }
            if(specialCharactersString.contains(Character.toString(Integer.parseInt(pass.substring(i,i+1))))){
                special++;
            }
        }
        if(pass.length()<8 && num==pass.length()){
            return 1;
        }
        if(pass.length()<8 && let==pass.length()){
            return 2;
        }
        if(pass.length()>8 && num>0 && let>0){
            return 3;
        }
        else{
            return 4;
        }
    }

    public static void main(String[] args){
        Scanner kb= new Scanner(System.in);
        System.out.println("Enter a password: ");
        String pass= kb.nextLine();
        int result= passwordValidator(pass);
        if(result==1){
            System.out.println("The password '"+pass+"' is a very weak password.");
        }
        else if(result==2){
            System.out.println("The password '"+pass+"' is a weak password.");
        }
        else if(result==3){
            System.out.println("The password '"+pass+"' is a strong password.");
        }
        else{
            System.out.println("The password '"+pass+"' is a very strong password.");
        }
    }
}
