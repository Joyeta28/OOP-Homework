package practice_problem03;

import java.util.Scanner;

public class bonus_percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Target Sales");
        double target_sales = sc.nextDouble();

        System.out.println("Enter the Attendence percentage");
        double attendence = sc.nextDouble();

        int bonus;

        if(target_sales >= 95 && attendence == 100) {
            bonus = 60;
        }
        else if(target_sales >= 95 && attendence >= 90){
            bonus = 40;
        }
        else if(target_sales >= 80 && attendence ==100){
            bonus = 40;
        }
        else if(target_sales >= 80 && attendence >= 90){
            bonus = 20;
        }
        else {
            bonus = 5;
        }
        System.out.println("The bonus percentage is "+bonus+"%");
    }
}
