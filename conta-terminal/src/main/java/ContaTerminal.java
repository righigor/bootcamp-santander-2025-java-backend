import java.util.Scanner;

public class ContaTerminal {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Por favor, digite o número da Conta!");
    int numero = scanner.nextInt();
    System.out.println("Por favor, digite o número da Agência!");
    String agencia = scanner.next();
    System.out.println("Por favor, digite o nome!");
    String nome = scanner.next();
    System.out.println("Por favor, digite o número do saldo!");
    double saldo = scanner.nextDouble();
    System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e o saldo " + saldo + " já está disponível para saque");

    scanner.close();
  }
}
