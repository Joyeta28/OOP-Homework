package practice_problem03;

import java.util.Scanner;

public class reverse_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        double[] numbers = new double[size];

        for(int i=0;i<size;i++){
            numbers[i] = sc.nextDouble();
        }

        for(int i=0,j=size-1;i<=j;i++,j--){
            double temp;
            temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }


        for(int i=0;i<size;i++){
            System.out.print(numbers[i] + " ");
        }
    }
}
