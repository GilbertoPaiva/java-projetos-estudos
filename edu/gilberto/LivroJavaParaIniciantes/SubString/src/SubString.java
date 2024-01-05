public class SubString {
    public static void main(String[] args) throws Exception {
        String orgstr = "Java makes the web move.";

        // constrói um substring
        String substr = orgstr.substring(5, 18);

        System.out.println("Orgstr: " + orgstr);
        System.out.println("substr: " + substr);
    }
}
