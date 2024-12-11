import java.util.Scanner;

public class Introduction_Task_03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double  radius = sc.nextDouble();
        double volume = Math.pow(radius,2)*Math.PI;
        System.out.println("The area of the ball is : "+volume);
    }
}
