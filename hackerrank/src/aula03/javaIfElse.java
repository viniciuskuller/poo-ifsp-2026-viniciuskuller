package aula03;
import java.util.Scanner;

public class javaIfElse {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        boolean isWeird;
        if( n % 2 != 0 ){
            isWeird = true;
        } else if(n >= 2 && n <= 5){
            isWeird = false;
        } else if(n >= 6 && n <= 20){
            isWeird = true;
        } else isWeird = false;

        if(isWeird){
            System.out.print("Weird");
        } else System.out.print("Not Weird");

        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
    }
}
