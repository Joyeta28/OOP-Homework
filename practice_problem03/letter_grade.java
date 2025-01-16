package practice_problem03;

import java.util.Scanner;

public class letter_grade {
    public static void main(String[] args) {
        System.out.println("Enter the grade ");
        Scanner sc = new Scanner(System.in);
        float grade = sc.nextFloat();
        if(grade >= 3.5 ){
            System.out.println("Letter grade");
        }
        else{
            System.out.println("Not a letter grade");
        }
    }
}
