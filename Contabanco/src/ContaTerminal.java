import java.util.Scanner;

public class ContaTerminal  {
    public static void main(String[] args) throws Exception {
        //TODO:Conhecer e importar a classe Scanner

        Scanner scanner = new Scanner(System.in);

        //Obter pela scanner os valores digitados no terminal

         System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo da Conta: ");
        double saldo = scanner.nextDouble();

        //Exibir as mensagens para o nosso usuario
        
        System.out.println();
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,");

        //Exibir a mensagem conta criada

        System.out.println("sua agência é " + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque.");
        scanner.close();
    }
}
