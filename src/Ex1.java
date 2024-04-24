public class Ex1 {

    public static void main(String[] args) throws Exception {
        double[][] matriz = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // conversao
        double[] matrizUnidimensional = new double[matriz.length * matriz[0].length];

        int index = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matrizUnidimensional[index++] = matriz[i][j];
            }
        }
        exibirMatriz(matrizUnidimensional, matriz.length, matriz[0].length);
    }

    static void exibirMatriz(double[] matriz, int linha, int coluna) {
        int i, j;

        for (i = 0; i < linha; i++) {
            for (j = 0; j < coluna; j++) {
                int index = i * coluna + j;
                System.out.print(matriz[index] + " ");
            }
        }
    }
}
