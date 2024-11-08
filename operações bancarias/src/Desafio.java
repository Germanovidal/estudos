import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        ;
        System.out.printf("Bem vindo ao Banco Digital!\n");

        String nome = "George Foreman";
        String tipoConta = "Corrente";
        double saldoConta = 1599.99;

        System.out.printf("*********************\n");
        System.out.printf("\nDados iniciais do cliente:\n");
        System.out.printf("Nome: " + nome + "\n");
        System.out.printf("Tipo de conta: " + tipoConta + "\n");
        System.out.printf("Saldo Inicial: " + saldoConta + "\n");
        System.out.printf("\n*********************\n");

        int opcoes = 0;
        String menu = """
                ** Digite sua opção **
                
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor 
                4 - Sair

                """;

        Scanner leitura = new Scanner(System.in);
        while (opcoes != 4) {
            System.out.println(menu);
            opcoes = leitura.nextInt();

            if (opcoes == 1) {
                System.out.printf("\nSeu saldo é " + saldoConta);
            } else if (opcoes == 2) {
                System.out.printf("\nQuanto deseja tranferir?\n");
                double valor = leitura.nextDouble();
                if (valor > saldoConta) {
                    System.out.println("\nNão há saldo para realizar a transferência.\n");
                } else {
                    saldoConta -= valor;
                    System.out.println("\nNovo saldo: " + saldoConta);
                }
            } else if (opcoes == 3) {
                System.out.println("Valor recebido: \n");
                double valor = leitura.nextDouble();
                saldoConta += valor;
                System.out.println("\nNovo saldo: " + saldoConta);
            } else if (opcoes != 4) {
                System.out.println("\nOpção inválida!\n");
            }
        }
    }
}
