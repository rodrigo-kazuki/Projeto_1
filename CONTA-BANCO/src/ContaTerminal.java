import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Seja bem vindo ao banco DIO. Por favor digite o numero da sua conta.");
        int conta = scanner.nextInt();
        
        System.out.println("Certo! Agora digite o código da sua agência, por favor.");
        String agencia = scanner.next();

        System.out.println("Digite seu nome, por favor.");
        String nomeCliente = scanner.next();

        System.out.println("Digite seu sobrenome, por favor.");
        String sobrenomeCliente = scanner.next();
        
        System.out.println("Insira seu saldo, por favor.");
        double saldo = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola " + nomeCliente + " " + sobrenomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
        + agencia + ",conta " + conta + " e seu saldo de " + saldo + " já está disponível para saque");
        
        
    }
}