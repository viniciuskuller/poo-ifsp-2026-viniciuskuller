package aula03;
import java.util.*;
import java.lang.Math;

class JavaLoopsII{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum = a;
            for(int j = 0; j <= n - 1; j++){
                double exp = (double) j;
                sum += Math.pow(2, exp) * b;
                if(j == 0){
                    System.out.printf("%d", sum);
                } else System.out.printf(" %d", sum);

            }
            System.out.printf("\n");

        }
        in.close();
    }
}
