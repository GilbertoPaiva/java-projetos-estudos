public class Search {
    public static void main(String[] args) throws Exception {
        int nums[] = {6, 8, 2, 7, 3, 5, 1, 4};
        int val = 8;
        boolean found = false;

        // Usa o laço for-each para procurar val em nums.
        for(int x: nums){
            if(x == val){
                found = true;
                break;
            }
        }
        // Verifica se o valor foi encontrado ou não
        System.out.println(found ? "Value found!":"Sorry, value not found");
    }
}
