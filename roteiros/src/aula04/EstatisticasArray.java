package aula04;

import java.util.Scanner;

public class EstatisticasArray {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] num = new int[5];

        for(int i = 0; i < num.length; i++){
            System.out.print("Digite o valor " + (i+1) + ": ");
            num[i] = scan.nextInt();
        }
        int soma = 0;
        int maior = num[0];
        for(int i = 0; i < num.length; i++){
            soma += num[i];
            if(num[i] > maior){
                maior = num[i];
            }
        }
        double media = (double) soma / num.length;

        System.out.println("Soma: " + soma);
        System.out.println("Media: " + media);
        System.out.println("Maior elemento: " + maior);
    }
}
