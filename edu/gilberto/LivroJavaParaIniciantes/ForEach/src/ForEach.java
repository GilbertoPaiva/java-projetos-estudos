public class ForEach {
    public static void main(String[] args) throws Exception {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        // Usa o aço for de esteo for-each para exibir e somar os valores.
        for(int x : nums){
            System.out.println("Value is: " +  sum);
            sum += x;
        }

        System.out.println("Summation: " + sum);
    }
}
