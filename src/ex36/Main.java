package ex36;

import java.util.ArrayList;

import java.util.Scanner;

import static java.lang.Integer.valueOf;

public class Main {
    public static void main(String[] args){
        Scanner kb= new Scanner(System.in);
        int num=0;
        String s="done";
        ArrayList<Integer> arr= new ArrayList<Integer>();
        while(num!=Integer.parseInt(s)){
            System.out.println("Enter a number: ");
            if(kb.hasNextInt()){
                num= kb.nextInt();
                arr.add(num);
            }
        }

        System.out.print("Numbers: ");
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+", ");
        }
        double avg=0;
        int sum=0;
        int min= Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;
        double std=0;
        for(int i=0;i<arr.size();i++){
            sum+=arr.get(i);
        }
        avg= sum/arr.size();
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)<min){
                min= arr.get(i);
            }
        }
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>max){
                max=arr.get(i);
            }
        }
        int[] stdArr= new int[arr.size()];
        int a=0;
        for(int i=0;i<arr.size();i++){
            a=arr.get(i)-(int)avg;
            stdArr[i]= (int) Math.pow(a,2);
        }
        int stdSum=0;
        double stdMean= 0;
        for(int i=0;i<stdArr.length;i++){
            stdSum+=stdArr[i];
        }
        stdMean= stdSum/stdArr.length;
        std= Math.sqrt(stdMean);
        System.out.println("The average is "+avg+"\n"+"The minimum is "+min+"\n"+"The maximum is "+max+"\n"+"The standard deviation is "+std+"\n");
    }
}
