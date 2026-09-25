package aula07ParteI;

public class Produto {
    private String nome;
    public double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome(){
    return nome;
    }
    public void setNome(String n){
        this.nome = n;


    }

    public double getPreco(){
        return preco;

    }

    public void setPreco(double p){
        if(p >= 0){
            this.preco = p;
        }

    }


}
