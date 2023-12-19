public class Bubble {
    public static void main(String[] args) {
        // Exemplo de array de inteiros
        int[] nums = {4, 2, 7, 1, 9, 5, 6};

        // Tamanho do array
        int size = nums.length;

        // Algoritmo de Bubble Sort
        for (int a = 0; a < size - 1; a++) {
            for (int b = 0; b < size - 1 - a; b++) {
                if (nums[b] > nums[b + 1]) {
                    // Troca os elementos se estiverem fora de ordem
                    int temp = nums[b];
                    nums[b] = nums[b + 1];
                    nums[b + 1] = temp;
                }
            }
        }

        // Imprime o array ordenado
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
