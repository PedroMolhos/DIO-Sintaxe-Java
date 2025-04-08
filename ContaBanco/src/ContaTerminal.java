import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite o número da sua conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o numero da sua agência:");
        String agencia = scanner.next();

        System.out.println("Digite o seu nome:");
        String nomeCliente = scanner.next();

        System.out.println("Digite o saldo da sua conta:");
        Double saldoConta = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + 
        " , obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
        " , conta " + numeroConta + 
        " e seu saldo " + saldoConta + " já está disponível para saque.");
        
        scanner.close();
    }
}