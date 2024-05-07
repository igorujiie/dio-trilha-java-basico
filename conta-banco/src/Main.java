import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ContaTerminal conta = new ContaTerminal();
        System.out.println("Por favor, digite o nome do Cliente !");
        conta.setNomeCliente(sc.nextLine());
        System.out.println();

        System.out.println("Por favor, digite o número da Agência !");
        conta.setAgencia(sc.nextLine());
        System.out.println();

        System.out.println("Por favor, digite o número da Conta !");
        conta.setNumero(sc.nextInt());
        System.out.println();

        System.out.println("Por favor, digite o saldo da Conta !");
        conta.setSaldo(sc.nextDouble());
        System.out.println();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", conta.getNomeCliente(), conta.getAgencia(), conta.getNumero(), conta.getSaldo());
        System.out.println();
        System.out.println();
         

        sc.close();
    }
}
