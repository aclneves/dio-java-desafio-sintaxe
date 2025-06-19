import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, digite o número da agência: ");
        int numeroAgencia = input.nextInt();
        input.nextLine();
        System.out.println("Por favor, digite o número da conta com o dígito verificador: ");
        String numeroConta = input.nextLine();
        System.out.println("Por favor, digite o nome do cliente: ");
        String nomeCliente = input.nextLine();
        System.out.println("Por favor, digite o saldo da conta: ");
        double saldo = input.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %d, conta %s e seu " +
                "saldo %.2f já está disponível para saque", nomeCliente, numeroAgencia, numeroConta, saldo);

        input.close();
    }
}
