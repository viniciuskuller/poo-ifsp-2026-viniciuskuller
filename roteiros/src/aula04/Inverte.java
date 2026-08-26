package aula04;
import java.util.*;
public class Inverte {
    public static void main(String[] args){

        int[] num = {25, 35, 45, 55, 65, 75, 85, 95};
        int[] inv = new int[num.length];
        for(int i = 0; i < inv.length; i++){
            inv[i] = num[num.length - i- 1];
        }

        System.out.println("Entrada: " + Arrays.toString(num));
        System.out.println("Saída: " + Arrays.toString(inv));
    }
}

