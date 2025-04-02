import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        int numeroConta;
        double saldo = 300;
        String agencia, nomeCliente;

        System.out.println("""
                --------------------
                BEM-VINDO AO BANCO G
                --------------------
                """);

        Scanner leia = new Scanner(System.in);
        System.out.println("Por favor digite o numero da Agência: ");
        agencia = leia.next();
        System.out.println("Digite o número da conta: ");
        numeroConta = leia.nextInt();
        System.out.println("Como quer ser chamado? ");
        nomeCliente = leia.next();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ", conta " + numeroConta + " e seu Saldo de R$" + String.format("%.2f", saldo) + " já está disponivel para saque.");
    }
}
