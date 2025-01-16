package practice_problem02;

public class sum_of_series {
    public static void main(String[] args) {
        int sum1 = 0;
        for(int i = 2;i<=20;i+=2){
            sum1 +=i;
        }
        System.out.println("The summation of the first series is " + sum1);

        int sum2=0;
        for(int i =1;i<20;i+=2){
            sum2+=i;
        }
        System.out.println("The summation of the second series is "+ sum2);
    }
}
