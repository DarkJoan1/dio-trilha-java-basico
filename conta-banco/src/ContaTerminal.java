import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       
        @SuppressWarnings("resource")
        Scanner Scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome Completo : ");
        String nome = Scanner.nextLine();

        System.out.println("Digite o número da sua Agência : ");
        String agencia = Scanner.next();

        System.out.println("Digite o número da sua conta : ");
        int conta = Scanner.nextInt();

        System.out.println("Por favor, digite o seu saldo : ");
        double saldo = Scanner.nextDouble();

        System.out.println("Olá, " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", sua  conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
