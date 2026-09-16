package aula07;

public class Produto {
    private String nome;
    public double preco;

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
