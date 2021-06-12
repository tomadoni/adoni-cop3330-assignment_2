package ex27;

import java.util.Scanner;

public class Main {

    public static boolean firstName(String str){
        if(str.length()<2){
            return false;
        }
        return true;
    }

    public static boolean lastName(String str){
        if(str.length()<2){
            return false;
        }
        return true;
    }

    public static boolean zipCode(String zip) {
        int num = 0;
        for (int i = 0; i<5; i++) {
            if (Character.isDigit(zip.charAt(i))==true) {
                num++;
            }
        }
        if(num==5){
            return true;
        }
        return false;
    }

    public static boolean employeeID(String str){
        int num=0;
        int let=0;
        int hyphen=0;
        for(int i=0;i<1;i++){
            if(Character.isLetter(str.charAt(i))==true){
                let++;
            }
        }
        if(str.substring(2,3).equals("-")){
            hyphen++;
        }
        for(int i=3;i<str.length()-1;i++){
            if(Character.isDigit(str.charAt(i))==true){
                num++;
            }
        }
        if(num==4 && let==2 && hyphen==1){
            return true;
        }
        return false;
    }

    public static void validateInput(String first, String last, String zip, String ID){
        int error=0;
        if(firstName(first)==false){
            System.out.println("The first name must be at least 2 characters long.");
            error++;
            if(first.length()<1){
                System.out.println("The first name must be filled in");
                error++;
            }
        }
        if(lastName(last)==false){
            System.out.println("The last name must be at least 2 characters long.");
            error++;
            if(last.length()<1){
                System.out.println("The last name must be filled in");
                error++;
            }
        }
        if(employeeID(ID)==false){
            System.out.println("The employee ID must be in the format of AA-1234.");
            error++;
        }
        if(zipCode(zip)==false){
            System.out.println("The zipcode must be a 5 digit number.");
            error++;
        }
        if(error==0){
            System.out.println("There were no errors found.");
        }
    }

    public static void main(String[] args){
        Scanner kb= new Scanner(System.in);
        String first="";
        String last="";
        String zip="";
        String ID="";
        System.out.println("Enter the first name:");
        first= kb.nextLine();
        System.out.println("Enter the last name:");
        last= kb.nextLine();
        System.out.println("Enter the ZIP code:");
        zip= kb.nextLine();
        System.out.println("Enter the Employee ID:");
        ID= kb.nextLine();
        validateInput(first,last,zip,ID);
    }
}
