package aula07ParteII;

public class LeitorLinhaCSV {
    public static void main (String[] args){
        String linha = "Maria,28,ATIVO";
        String outraLinha = "maria,28,ATIVO";
        String[] n = linha.split(",");
        for(int i = 0; i < n.length; i++){
            System.out.println(n[i]);
        }
        System.out.println(linha.equals(outraLinha));
        System.out.println(linha.equalsIgnoreCase(outraLinha));
        String s = String.format("Nome: %s | Idade: %s anos | Status: %s", n[0],n[1],n[2]);
        System.out.println(s);
    }
}
