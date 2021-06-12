package ex29;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int c=0;
        int r=0;
        int years=0;
        Scanner kb= new Scanner(System.in);
        while(c<1){
            System.out.println("What is the rate of return?");
            if(kb.hasNextInt()){
                r= kb.nextInt();
                if(r>0){
                    years= 72/r;
                    System.out.println("It will take "+years+" years to double your initial investment.");
                    c++;
                }
                else{
                    System.out.println("Sorry. That's not a valid input.");
                }
            }

            else{
                System.out.println("Sorry. That's not a valid input.");
            }

        }
    }
}
