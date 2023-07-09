import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o número da conta:");
        int numero = sc.nextInt();
        System.out.println("Digite o número da agência:");
        String agencia = sc.next();
        System.out.println("Digite o nome do cliente:");
        String nomeCliente = sc.nextLine();
        sc.nextLine();
        System.out.println("Digite o saldo:");
        double saldo = sc.nextDouble();


        System.out.println("Olá "+ nomeCliente +
                ", obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + ", conta " + numero + " e seu saldo " +
                saldo + " já está disponível para saque");
    }
}
