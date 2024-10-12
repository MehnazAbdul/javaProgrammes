package college;

import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        
        System.out.println("Please enter 5 integers:");

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("You entered:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        sc.close();
    }
}
