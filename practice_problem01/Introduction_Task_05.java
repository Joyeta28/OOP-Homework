package practice_problem01;

import java.util.Scanner;

public class Introduction_Task_05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of the arm");
        double  arm = sc.nextDouble();
        double area = (Math.sqrt(3)/4)*(Math.pow(arm,2));
        System.out.println("The area of the equilateral triangle is : "+area);
    }
}
