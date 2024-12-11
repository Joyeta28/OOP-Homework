import java.util.Scanner;
public class Introduction_Task_04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the temperature in celsius");
        double  ctemp = sc.nextDouble();
        double ftemp = ((9*ctemp)/5)+32;
        System.out.println("The temperture in Fahrenheit is : "+ftemp);
    }
}
