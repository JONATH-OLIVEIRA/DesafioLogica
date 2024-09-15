
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Snail {

    // Função para percorrer a matriz em espiral
    public static List<Integer> snail(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        
        if (matrix == null || matrix.length == 0) {
            return result; // Retorna lista vazia se a matriz estiver vazia
        }

        int n = matrix.length;
        int inicioLinha = 0, fimLinha = n - 1;
        int inicioColuna = 0, fimColuna = n - 1;

        while (inicioLinha <= fimLinha && inicioColuna <= fimColuna) {
            // Percorre da esquerda para a direita ao longo da linha superior
            for (int col = inicioColuna; col <= fimColuna; col++) {
                result.add(matrix[inicioLinha][col]);
            }
            inicioLinha++; // Movimenta a linha inicial para baixo

            // Percorre de cima para baixo ao longo da coluna direita
            for (int row = inicioLinha; row <= fimLinha; row++) {
                result.add(matrix[row][fimColuna]);
            }
            fimColuna--; // Movimenta a coluna final para a esquerda

            // Percorre da direita para a esquerda ao longo da linha inferior (se aplicável)
            if (inicioLinha <= fimLinha) {
                for (int col = fimColuna; col >= inicioColuna; col--) {
                    result.add(matrix[fimLinha][col]);
                }
                fimLinha--; // Movimenta a linha final para cima
            }

            // Percorre de baixo para cima ao longo da coluna esquerda (se aplicável)
            if (inicioColuna <= fimColuna) {
                for (int row = fimLinha; row >= inicioLinha; row--) {
                    result.add(matrix[row][inicioColuna]);
                }
                inicioColuna++; // Movimenta a coluna inicial para a direita
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o tamanho da matriz
        System.out.println("Digite o tamanho da matriz (N x N): ");
        int n = scanner.nextInt();

        // Cria a matriz N x N
        int[][] matrix = new int[n][n];

        // Solicita os valores da matriz
        System.out.println("Digite os valores da matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Chama a função snail para percorrer a matriz em espiral
        List<Integer> resultado = snail(matrix);

        // Imprime o resultado
        System.out.println("Matriz em formato espiral: " + resultado);
    }
}
