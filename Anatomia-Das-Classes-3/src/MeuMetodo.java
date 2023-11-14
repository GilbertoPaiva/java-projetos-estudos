public class MeuMetodo {
    public static void main(String[] args) {
        String primeiroNome = "Gilberto";
        String segundoNome = "Paiva";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
        

    }
    
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
