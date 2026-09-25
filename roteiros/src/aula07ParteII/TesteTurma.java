package aula07ParteII;


import java.util.Locale;
import java.util.Scanner;

public class TesteTurma {
    public static void main(String[] args){
        Turma turma = new Turma();
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        while(scan.hasNext()){
            String nome = scan.nextLine().trim();
            if(nome.isEmpty()){
                break;
            }
            double d = scan.nextDouble();
            scan.nextLine();

            Aluno a = new Aluno(nome, d);
            turma.matricular(a);
        }
        System.out.println("Média: " + turma.calcularMedia());
        System.out.println("Melhor aluno: "+ turma.encontrarMelhorAluno().getNome());
    }

}