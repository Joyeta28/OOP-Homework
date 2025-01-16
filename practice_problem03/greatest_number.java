package practice_problem03;

import java.util.Scanner;

public class greatest_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the series");
        int size = sc.nextInt();

        double[] numbers = new double[size];

        for(int i = 0;i<size;i++){
            numbers[i]= sc.nextDouble();
        }
        double max_num = numbers[0];
        for(int i=0;i<size;i++){
            if(numbers[i]>max_num) max_num = numbers[i];
        }
        System.out.println("The maximum number in the series is " + max_num);
    }

}
