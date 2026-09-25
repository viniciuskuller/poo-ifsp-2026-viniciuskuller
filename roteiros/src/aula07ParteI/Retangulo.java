package aula07ParteI;

public class Retangulo {
    private double altura;
    private double largura;
    public Retangulo(double largura, double altura){
        this.altura = altura;
        this.largura = largura;
    }

    public Retangulo(double lado){
        this(lado,lado);
    }
    public Retangulo(){
        this(1,1);
    }

    public double calcularArea(){
        return largura * altura;
    }
}
