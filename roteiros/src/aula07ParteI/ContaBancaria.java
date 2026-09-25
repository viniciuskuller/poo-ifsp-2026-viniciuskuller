package aula07ParteI;

public class ContaBancaria {
    private String titular;
    private double saldo;
    private boolean ativa;

    public ContaBancaria(String titular, double saldo, boolean ativa){
        this.saldo = saldo;
        this.titular = titular;
        this.ativa = ativa;
    }
    public ContaBancaria(String titular){
        this(titular, 0, true);
    }
    public String getTitular(){
        return this.titular;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public boolean isAtiva(){
        return this.ativa;
    }
    public void depositar(double valor){
        this.saldo += valor;
    }
}
