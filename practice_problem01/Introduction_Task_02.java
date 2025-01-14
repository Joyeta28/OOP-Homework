package practice_problem01;

import java.util.Scanner;

public class Introduction_Task_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the ball");
        double  radius = sc.nextDouble();
        double volume = (4.0/3)*Math.pow(radius,3)*Math.PI;
        System.out.println("The volume of the ball is : "+volume);
    }
}
