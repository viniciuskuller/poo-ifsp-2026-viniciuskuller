package aula04;
import java.util.*;
public class ParesImpares {
    public static void main(String[] args){
        int nPar = 0;
        int nImpar = 0;

        int[] num = new int[10];
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite 10 numeros: ");

        for(int i = 0; i < num.length;i++){
          num[i] = scan.nextInt();
        }

        for(int i = 0; i < num.length; i++){
            if(num[i] % 2 == 0){

                nPar++;
            } else {
                nImpar++;
            }
        }
        int j = 0;
        int k = 0;

        int[] par = new int[nPar];
        int[] impar = new int[nImpar];

        for(int i =0; i < num.length;i++){
            if(num[i] % 2 == 0){
                par[j] = num[i];
                j++;
            } else {
                impar[k] = num[i];
                k++;
            }
        }

        System.out.println("Entrada: " + Arrays.toString(num));
        System.out.println("Pares = " + Arrays.toString(par));
        System.out.println("Impares = " + Arrays.toString(impar));
    }
}
