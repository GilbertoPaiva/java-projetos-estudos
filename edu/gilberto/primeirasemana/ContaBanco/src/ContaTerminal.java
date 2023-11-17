import java.util.Scanner;

public class ContaTerminal {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Por favor digite o número da agência:");
    String agencia = scan.nextLine();

    System.out.println("Por favor digite o número da conta:");
    int numeroConta = scan.nextInt();
    scan.nextLine();

    System.out.println("Por favor digite o nome do Cliente:");
    String nomeCliente = scan.nextLine();

    System.out.println("Por favor digite o saldo da conta:");
    double saldo = scan.nextDouble();

    System.out.println("Olá " + nomeCliente + ", obrigado por criar um
    a conta em nosso banco, sua agência é "
                + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fechando o scanner
        scan.close();
}
}
