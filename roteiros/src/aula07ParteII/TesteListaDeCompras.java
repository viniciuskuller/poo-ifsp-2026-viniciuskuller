package aula07ParteII;
import aula07ParteI.Produto;

import java.util.*;
public class TesteListaDeCompras {
    public static void main(String[] args){
        ListaDeCompras l = new ListaDeCompras();
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        while(scan.hasNext()){
            String nome = scan.nextLine().trim();
            if(nome.isEmpty()){
                break;
            }
            double d = scan.nextDouble();
            scan.nextLine();

            Produto p = new Produto(nome, d);
            l.adicionar(p);
        }

        l.imprimirTodos();
        System.out.println("Total: " + l.calcularTotal());
    }
}
