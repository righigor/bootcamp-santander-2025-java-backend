// Escreva um codigo que receba o tamanho do lado de um quadrado, calcule sua area e exiba na tela

import java.util.Scanner;

public class Exec2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o lado do quadrado:");
    int lado = scanner.nextInt();
    int area = lado * lado;
    System.out.println("A area do quadrado é " + area);
  }
}
