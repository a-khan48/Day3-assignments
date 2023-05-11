package org.arraysNLists;
import java.util.Scanner;
import java.util.ArrayList;
public class lastItem {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> array = new ArrayList<>();

        System.out.print("Input any amount of string items, when done press Enter: ");

        while (true){
            String item = scanner.nextLine();
            if (item.equals("")) {
                break;
            } array.add(item);
        }
        String lastItem = array.get(array.size() - 1);
        System.out.println("The last item in the list is: " + lastItem);
    }
}

