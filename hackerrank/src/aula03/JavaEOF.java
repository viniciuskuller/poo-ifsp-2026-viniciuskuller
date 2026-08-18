package aula03;

import java.util.*;


public class JavaEOF {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 0;


        while (scan.hasNext()){

            String a = scan.nextLine();
            i++;
            System.out.printf("%d %s\n", i, a);

        }

    }
}
