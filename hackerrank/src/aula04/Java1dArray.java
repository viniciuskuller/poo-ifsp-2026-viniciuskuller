package aula04;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Java1dArray {
    public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            int n;
            n = scan.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = scan.nextInt();
            }

            for(int i = 0; i < n; i++){
                System.out.println("" + a[i]);
            }
    }
}
