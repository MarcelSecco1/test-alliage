public class Ex2 {

    public static void main(String[] args) {
        int[][] matriz = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        int x1 = 1,
                x2 = 1,
                y1 = 1,
                y2 = 1;

        int[][] submatriz = criarSubmatriz(matriz, x1, x2, y1, y2);

        for (int i = 0; i < submatriz.length; i++) {
            for (int j = 0; j < submatriz.length; j++) {
                System.out.print(submatriz[i][j] + " ");
            }
            System.out.println();
        }

        // resultado esperado para x1 = 1, x2 = 1, y1 = 1, y2 = 1
        // 6 7
        // 10 11
    }

    private static int[][] criarSubmatriz(int[][] matriz, int x1, int x2, int y1, int y2) {
        int lengthSub = matriz.length - x1 - x2;

        int[][] submatriz = new int[lengthSub][lengthSub];

        int i, j;
        for (i = x1; i < matriz.length - x2; i++) {
            for (j = y1; j < matriz.length - y2; j++) {
                submatriz[i - x1][j - y1] = matriz[i][j];
            }
        }

        return submatriz;
    }

}
