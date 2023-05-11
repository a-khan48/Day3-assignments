package org.chatBot;
import java.util.Scanner;
public class chatBot {
    public static void main(String[] args){


    }
    public static void greeting(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, my name is ChatBot. What's your name?");
    }
    public static void name(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        System.out.println("Can you re-type your name one more time to confirm?");
        String userName = scanner.nextLine();
        System.out.println("Hello " + userName + ", Nice to meet you!");
    }
    public static void age(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's play a little game.");
        System.out.println("I'm going to ask you a few questions, depending on your answer, I'll try and guess your age!");
//        Questions
        System.out.println("Do you remember a life before smartphones?");
        String res1 = scanner.nextLine();

        if (res1.equalsIgnoreCase("no")){
            System.out.println("I'm going to assume you are under the age of 18.");
        } else {
            System.out.println("Do you remember the beginning of the Afghanistan War?");
            String res2 = scanner.nextLine();

            if (res2.equalsIgnoreCase("no")){
                System.out.println("I am going to assume you are around the age of 18-24");
            } else{
                System.out.println("Do you remember the end of the Cold War?");
                String res3 = scanner.nextLine();

                if (res2.equalsIgnoreCase("no")) {
                    System.out.println("I am going to assume you are around the age of 25-35");
                }else {
                    System.out.println("I am going to assume you are older than 35.");
                }
                public static void count(){

                }
            }
        }
    }
}
