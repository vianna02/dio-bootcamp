import java.util.Scanner;

// Executar pela IDE
public class ContaBanco {
    public static void main(String[] args) {
        // Atributos
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner sc = new Scanner(System.in);

        // Inputs
        System.out.print("Digite o numero da conta: ");
        numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite a agencia: ");
        agencia = sc.nextLine();
        System.out.print("Digite seu nome: ");
        nomeCliente = sc.nextLine();
        System.out.print("Digite seu saldo: ");
        saldo = sc.nextDouble();

        System.out.println();

        // Return
        System.out.printf("Olá, %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s, e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numeroConta, saldo);

    }
}