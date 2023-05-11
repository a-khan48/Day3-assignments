package org.Methods;
import java.util.Scanner;
public class divideMethod {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        double num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter another number: ");
        double num2 = Integer.valueOf(scanner.nextLine());
        System.out.println(num1 + "/" + num2 + "=" + divide(num1, num2));
    }
    public static double divide(double num1, double num2){
        return(num1 / num2);
    }
}