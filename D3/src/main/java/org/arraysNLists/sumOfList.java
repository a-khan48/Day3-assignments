package org.arraysNLists;
import java.util.Scanner;
import java.util.ArrayList;
public class sumOfList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        System.out.println("Enter integers to be added together, press 0 to stop:");

        while (true) {
            int item = Integer.valueOf(scanner.nextLine());
            if (item == 0) {
                break;
            } else {
                array.add(item);
            }
        }
        int sum = sum(array);
        System.out.println(array + " were the items in the list. The sum of that list is: " + sum);
    }
    public static int sum(ArrayList<Integer> array) {
        int sum = 0;
        for (Integer input : array) {
            sum += input;
        }
        return sum;
    }
}
