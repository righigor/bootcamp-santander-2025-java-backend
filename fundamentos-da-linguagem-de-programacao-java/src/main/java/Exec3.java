// Escreva um codigo que receba a base e a altura de um retangulo, calcule sua area e exiba na tela

import java.util.Scanner;

public class Exec3 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a altura: ");
    int h = scanner.nextInt();
    System.out.println("Digite a base: ");
    int b = scanner.nextInt();
    System.out.println("A area do retangulo é " + (b*h));
  }
}
