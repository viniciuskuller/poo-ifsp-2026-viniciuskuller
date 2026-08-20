package aula03;

public class CacheInteger {
    public static void main(String [] args){
        Integer x1 = 67;
        Integer x2 = 67;
        System.out.println("Par dentro da faixa (== ): " + (x1 == x2));
        System.out.println("Par dentro da faixa (.equals()): " + x1.equals(x2));
        Integer y1 = 670;
        Integer y2 = 670;
        System.out.println("Par fora da faixa (== ): " + (y1 == y2));
        System.out.println("Par fora da faixa (.equals()): " + y1.equals(y2));


    }
}
