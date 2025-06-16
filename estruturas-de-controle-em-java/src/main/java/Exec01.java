// escreva um codigo onde o usuario entra com um numero e seja gerada a tabuada de 1  ate 10 desse numero;

import java.util.Scanner;

public class Exec01 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um numero: ");
    int num = scanner.nextInt();

    for (int i = 1; i <= 10; i++) {
      System.out.println(num + " * " + i + ": " + (i*num));
    }
  }
}
