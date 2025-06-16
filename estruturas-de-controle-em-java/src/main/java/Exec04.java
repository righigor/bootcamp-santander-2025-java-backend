//Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números, a execução do código irá continuar até que o número informado dividido pelo primeiro número tenha resto diferente de 0 na divisão, números menores que o primeiro número devem ser ignorados

import java.util.Scanner;

public class Exec04 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num;
    int n;
    System.out.println("Digite um numero");
    num = scanner.nextInt();
    do {
      System.out.println("Digite outro numero:");
      n = scanner.nextInt();
    } while (num % n == 0 || n > num);
  }
}
