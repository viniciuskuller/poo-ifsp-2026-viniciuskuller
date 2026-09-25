package aula07ParteII;
import java.util.*;
public class ExtratorEmail {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String email = scan.nextLine();
        int x = email.indexOf('@');
        String e1 = email.substring(0, x);
        String e2 = email.substring(x);
        System.out.println(e1);
        System.out.println(e2);
        if(email.contains("ifsp")){
            System.out.println("Email institucional");
        }else System.out.println("Email externo");
    }
}
