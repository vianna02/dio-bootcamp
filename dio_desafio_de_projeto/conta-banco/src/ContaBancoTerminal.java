// Executar pelo terminal passando os parâmetros
public class ContaBancoTerminal {
    public static void main(String[] args) {
        int numeroConta = Integer.valueOf(args[0]);
        String agencia = args[1];
        String nomeCliente = args[2];
        double saldo = Double.valueOf(args[3]);

        System.out.println();

        System.out.printf("Olá, %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s, e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numeroConta, saldo);

    }
}
