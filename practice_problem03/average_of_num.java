package practice_problem03;

import java.util.Scanner;

public class average_of_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the how many numbers to average ");
        int size = sc.nextInt();
        double sum = 0;
        double[] numbers = new double[size];
        for(int i=0;i<size;i++){
            numbers[i] = sc.nextDouble();
            sum+=numbers[i];
        }
        double average = sum/size;
        System.out.println("The average of the numbers is " + average);
    }
}
