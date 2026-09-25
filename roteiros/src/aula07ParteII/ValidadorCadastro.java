package aula07ParteII;
import java.util.Scanner;
import java.lang.String;
public class ValidadorCadastro {


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();
        n = n.trim();
        if(n.isEmpty()){
            System.out.println("Nome inválido!");
        } else System.out.println("" + n.toUpperCase());

        System.out.println("" + n.length());
    }

}
