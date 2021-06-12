package ex38;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static int[] filterEvenNumbers(int[] arr1){
        int[] arr2= new int[arr1.length/2];
        int c=0;
        for(int i=0;i<arr1.length-1;i++){
            if(arr1[i]%2==0){
                arr2[c]=arr1[i];
                c++;
            }
        }
        return arr2;
    }

    public static void main(String[] args){
        Scanner kb= new Scanner(System.in);
        System.out.println("Enter a list of numbers, separated by spaces.");
        String arr = kb.nextLine();
        String[] items= new String[arr.length()/2];
        int c=0;
        for(int i=0;i<arr.length()-1;i+=2){
            items[c]=arr.substring(i,i+1);
        }

        int[] results = new int[items.length];

        for (int i = 0; i < items.length; i++) {
            try {
                results[i] = Integer.parseInt(items[i]);
            } catch (NumberFormatException nfe) {
            };
        }
        filterEvenNumbers(results);
    }
}
