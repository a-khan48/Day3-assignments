package org.Methods;
import java.util.Scanner;
public class averageMethod {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        double num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter another number: ");
        double num2 = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter a third number: ");
        double num3 = Integer.valueOf(scanner.nextLine());

        System.out.println("The average is: " + average(num1,num2,num3));

    }
    public static double sum(double num1, double num2, double num3){
        return(num1+num2+num3);
    }
    public static double average(double num1, double num2, double num3){
        return(sum(num1,num2,num3) / 3);
    }
}
