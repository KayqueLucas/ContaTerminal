import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // int numero = 1021;
        // String agencia = "067-8";
        // String nomeCliente = "Mario";
        // double saldo = 237.48;

        System.out.println("Digite seu Nome: ");
        String nomeCliente = scanner.next();
        System.out.println("Digite sua Agencia: ");
        String agencia = scanner.next();
        System.out.println("Digite o numero da Conta: ");
        int numero = scanner.nextInt();
        System.out.println("Digite Saldo Depositado: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

    }
}
