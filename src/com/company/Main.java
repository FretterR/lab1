
package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scan1 = new Scanner(System.in);
        String userResponse = "yes";
do{

        System.out.println("Please type the length here");
        double length = scan1.nextDouble();

        System.out.println("Now please type the width");
        double width = scan1.nextDouble();

        double area = length * width;
        System.out.println("Area: " + area);
        double perimeter = (length * 2) + (width * 2);
        System.out.println("Perimeter: " + perimeter);

    System.out.println("Continue? (yes/no)");
        scan1.nextLine();
        userResponse = scan1.nextLine();

}
        while(userResponse.equalsIgnoreCase("yes") ) ;
        System.out.print("bye");

    }


}
