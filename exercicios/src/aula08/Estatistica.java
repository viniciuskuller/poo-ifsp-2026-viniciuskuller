package aula08;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Estatistica {
    public static double media(double[] valores){
        double sum = 0;
        for(int i = 0; i < valores.length; i++){
            sum += valores[i];
        }
        double media = sum / valores.length;
        return media;
    }
    public static double variancia(double[] valores, double media){
        double sum = 0;
        for(int i = 0; i < valores.length; i++){
           sum += pow((valores[i] - media), 2);
        }
            double variancia = sum / valores.length;
            return variancia;

    }
    public static double desvioPadrao(double variancia){
        double desvioPadrao = sqrt(variancia);
        return desvioPadrao;
    }
    public static void main(String[] args){
        double[] valores = {5, 5, 6 ,7, 8, 9, 4, 3 ,2, 2, 4, 5};
        double media = media(valores);
        double var = variancia(valores, media(valores));
        System.out.println("" + media);
        System.out.println("" + var);
        System.out.println("" + desvioPadrao(var));
    }
}
