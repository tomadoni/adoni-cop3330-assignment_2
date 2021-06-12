package ex35;

import java.util.ArrayList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner kb= new Scanner(System.in);
        ArrayList<String> people = new ArrayList<String>();
        String person="hello";
        while(!person.equals(" ")){
            System.out.println("Enter a name: ");
            person= kb.nextLine();
            if(!person.equals(" ")) {
                people.add(person);
            }
        }
        int random= (int)(Math.random() * people.size());
        System.out.println("The winner is ..."+people.get(random)+".");
    }
}
