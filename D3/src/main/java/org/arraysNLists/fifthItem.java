package org.arraysNLists;
import java.util.Scanner;
import java.util.ArrayList;
public class fifthItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> array = new ArrayList<>();

        System.out.print("Input at least 5 string items to be printed, once complete press Enter:");

        while (true){
            String item = scanner.nextLine();
            if (item.equals("")) {
                break;
            } array.add(item);
            }
        System.out.println("The fifth item in the list is: " + array.get(4));
        }

    }
