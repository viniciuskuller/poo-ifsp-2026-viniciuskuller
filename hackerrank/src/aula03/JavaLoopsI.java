package aula03;
import java.util.Scanner;




public class JavaLoopsI {
    public static void main(String[] args) {

        Scanner scan =  new Scanner(System.in);

        int n = scan.nextInt();

        for(int i = 1; i <=10;i++ ){
            int j = n * i;
            System.out.printf("%d x %d = %d\n", n, i, j);
        }



        scan.close();
    }
}
