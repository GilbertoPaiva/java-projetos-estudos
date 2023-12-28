public class ArrayTridimensionalExemplo {
    public static void main(String[] args) {
        // Declarando e criando um array tridimensional
        int[][][] arrayTridimensional = new int[4][5][6];

        // Preenchendo o array com alguns valores
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 6; k++) {
                    arrayTridimensional[i][j][k] = i + j + k;
                }
            }
        }

        // Exibindo os valores do array tridimensional
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 6; k++) {
                    System.out.print(arrayTridimensional[i][j][k] + " ");
                }
                System.out.println(); // Nova linha após cada linha do array
            }
            System.out.println(); // Linha em branco para separar cada "camada"
        }
    }
}
