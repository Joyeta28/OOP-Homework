package practice_problem02;

import java.util.Scanner;

public class leap_Year_detection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the year");
        int year = sc.nextInt();

        if(year % 4 == 0 || year % 400 == 0){
            System.out.println("The year is a leap year");
        }
        else {
            System.out.println("Not a leap year");
        }
    }
}
