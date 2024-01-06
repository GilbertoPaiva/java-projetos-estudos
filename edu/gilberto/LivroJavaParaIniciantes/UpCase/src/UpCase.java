public class UpCase {
    public static void main(String[] args) throws Exception {
        char ch;

        for(int i = 0; i < 10; i++){
            ch = (char) ('a' + i);
            System.out.print(ch);

            // Essa instrução desativa o sexto bit.
            ch = (char) ((int) ch & 65503); // agor ch é maiúscula

            System.out.print(ch + " ");
        }
    }
}
