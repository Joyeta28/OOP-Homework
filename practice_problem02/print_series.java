package practice_problem02;

public class print_series {
    public static void main(String[] args) {


    for(int i=2;i<=20;i+=2){
        System.out.print( i + " ");
    }
        System.out.println();

    int j = 2;
    while (j<=20){
        System.out.print(j + " ");
        j+=2;
    }
        System.out.println();

    int k = 2;
    do{
        System.out.print(k + " ");
        k+=2;
    }while (k<=20);
        System.out.println();
        System.out.println();

        for(int l=1;l<20;l+=2){
            System.out.print( l + " ");
        }
        System.out.println();

        int m = 1;
        while (m<20){
            System.out.print(m + " ");
            m+=2;
        }
        System.out.println();

        int n = 1;
        do{
            System.out.print(n + " ");
            n+=2;
        }while (n<20);

    }
}
