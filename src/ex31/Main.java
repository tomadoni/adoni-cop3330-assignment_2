package ex31;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner kb= new Scanner(System.in);
        int age=0;
        int restRate=0;
        int targetHeartRate=0;
        int intensity=0;
        System.out.println("What is your age?");
        age= kb.nextInt();
        System.out.println("What is your resting heart rate?");
        restRate= kb.nextInt();
        System.out.println("Intensity    | Rate"+"\n"+"-------------|--------");
        for(int i=55;i<=95;i+=5) {
            targetHeartRate = (((220 - age) - restRate) * intensity / 100) + restRate;
            intensity = i;
            System.out.println(i+"%          "+"| "+targetHeartRate+" bpm");
        }
    }
}
