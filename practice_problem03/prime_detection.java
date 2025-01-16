package practice_problem03;

import java.util.Scanner;

public class prime_detection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  the Number");
        int num = sc.nextInt();

        if(num<=1) System.out.println("Not a prime number");

        boolean flag = false;

        for(int i=2;i*i<=num;i++){
            if (num%i == 0) flag = true;
        }

        if(flag == true) System.out.println("Not a prime number");
        else System.out.println("The given number is a prime number");
    }

}
