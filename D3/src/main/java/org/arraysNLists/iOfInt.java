package org.arraysNLists;
import java.util.Scanner;
import java.util.ArrayList;
public class iOfInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();

        while (true){
            int item = Integer.valueOf(scanner.nextLine());
            if(item == 0){
                break;
            } else {
                array.add(item);
            }
                }
        System.out.println("Done entering integers into the list.");
        System.out.println("What number are you looking for in the list?");

        int num = Integer.valueOf(scanner.nextLine());

        for(int i = 0; i < array.size(); i++){
            if(array.get(i) == num){
                System.out.println(num + " is at index" + i);
            }
        }
    }
}
