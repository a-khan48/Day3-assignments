package org.chatBot;
import java.util.Scanner;
public class chatBot {
    public static void main(String[] args){
            greeting();
            name();
            age();
            count();
            test();
            System.out.println("Nice chatting with you, Goodbye!");

    }
    public static void greeting(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, my name is ChatBot. What's your name?");
    }
    public static void name(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String userName = scanner.nextLine();
        System.out.println("Can you re-type your name one more time to confirm?");
        String userName2 = scanner.nextLine();
        System.out.println("Hello " + userName2 + ", Nice to meet you!");
    }
    public static void age(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("I'm going to try and guess your age, what is your birth year?");

        int birthYear = scanner.nextInt();
        scanner.nextLine();
        int age = 2023 - birthYear;
        System.out.println("I assume you are " + age + " years old.");
        System.out.println("Was i correct?");
        String answer = scanner.nextLine();

        while (answer.equalsIgnoreCase("no")) {
            System.out.println("I'm sorry for getting it wrong.");
            age = 2023 - birthYear - 1;
            System.out.println("Your age should be " + age);
            System.out.println("Was I correct this time?");
            answer = scanner.nextLine();
        }
    }
    public static int count(){
        System.out.println("Give me a number and I will count to it.");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int i = 0;
        for( i = 1; i < count; i++) {
            System.out.println(i);
        }
        System.out.println(count);
        return i;
    }
    public static void test() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Think fast! Here's a quiz!");
        System.out.println("What programming language are we learning right now?");

        System.out.println("A. Java");
        System.out.println("B. JavaScript");
        System.out.println("C. HTML");
        System.out.println("D. CSS");
        System.out.println("Type in your answer(A, B, C, D) ");
        String answer = scanner.nextLine();

        while (true) {

            if (answer.equalsIgnoreCase("A")) {
                System.out.println("Good job! You got it right.");
                break;
            }
            System.out.println("Oh no! Try again!");
            answer = scanner.nextLine();
        }
    }
}
