package aula07ParteI;

public class Calculadora {
    public int somar(int a, int b){
        return a + b;
    }
    public int somar(int a, int b, int c){
        return a + b + c;
    }

    public int  somar(int... numeros){
        int sum = 0;
        for(int n : numeros){
            sum += n;
        }
        return sum;
    }
}

