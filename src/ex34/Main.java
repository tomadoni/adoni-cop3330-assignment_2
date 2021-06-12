package ex34;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner kb= new Scanner(System.in);
        String[] arr1= {"John Smith","Jackie Jackson","Chris Jones","Amanda Cullen","Jeremy Goodwin"};
        String remove="";
        System.out.println("There are 5 employees: ");
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
        System.out.println("Enter an employee name to remove: ");
        remove= kb.nextLine();
        String[] arr2= new String[4];
        int c=0;
        for(int i=0;i<arr1.length;i++){
            if(!arr1[i].equals(remove)){
                arr2[c]=arr1[i];
                c++;
            }
        }
        System.out.println("There are 4 employees: ");
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
}
