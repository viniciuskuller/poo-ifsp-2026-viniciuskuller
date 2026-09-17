package aula08;

public class Magico {
    public static boolean isQuadradoMagico(int[][] valores) {
        int linhas = valores.length;
      for(int i = 0; i < linhas; i++){
          if (valores.length != valores[i].length) {
              return false;
          }
      }

        int[] sum = new int[valores.length * 2 + 2];
        for (int i = 0; i < sum.length-1; i++) {
            if (i < sum.length - 2 - valores.length) {
                for (int j = 0; j < valores.length; j++) {
                    sum[i] += valores[i][j];
                }
            } else if (i < sum.length - 2) {
                int x = i % valores.length;
                for (int j = 0; j < valores.length; j++) {
                    sum[i] += valores[j][x];
                }
            } else {
                for (int j = 0; j < valores.length; j++) {
                    sum[i] += valores[j][j];
                    sum[i+1] += valores[j][valores.length - 1 - j];
                }
                break;
            }
        }

        for (int i = 0; i < sum.length - 1; i++) {
            if (sum[i] != sum[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] valores = {{2, 9, 4},
                {7, 5, 3},
                {6, 1, 8}
        };
        if (isQuadradoMagico(valores)) {
            System.out.println("É um quadrado Mágico");
        } else {
            System.out.println("Não é um quadrado mágico");
        }
    }
}
