import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Informe seu Tipo de conta: ");
        String conta = scanner.nextLine();

        System.out.println("Informe seu saldo inicial: ");
        double saldo = scanner.nextDouble();

        System.out.println(
                "***********\n" +
                        "Dados Iniciais do cliente:\n" +
                        "\nNome: " + nome  +
                        "\nTipo de conta " + conta  +
                        "\nSaldo inicial R$" + saldo  +
                        "\n" +
                        "***********\n"
        );

         while(true){
             System.out.println(
                     "1 - Consultar saldo\n" +
                     "2 - Transferir valor\n"+
                     "3 - Receber valor\n" +
                     "4 - Sair"
             );
             int escolha = scanner.nextInt();

             switch (escolha){
                 case 1:
                     System.out.println("Seu saldo é de R$" + saldo);
                     break;
                 case 2:
                     System.out.println("Digite o valor da transferencia:");
                     double transferencia = scanner.nextDouble();
                     if (transferencia > 0 && transferencia <= saldo){
                         saldo = saldo - transferencia;
                         System.out.println("Seu saldo atual é de R$" + saldo);
                     }else {
                         System.out.println("Saldo insuficiente");
                     }
                     break;
                 case 3:
                     System.out.println("Digite o valor a receber:");
                     double receber = scanner.nextDouble();
                     if (receber > 0){
                         saldo = saldo + receber;
                         System.out.println("Seu saldo atual é de R$" + saldo);
                     }else {
                         System.out.println("Valor incorreto");
                     }
                     break;

                 case 4:
                     System.out.println("Muito obrigado");
                     return;
                 default:
                     System.out.println("Opção invalida");

             }
         }

    }
}
