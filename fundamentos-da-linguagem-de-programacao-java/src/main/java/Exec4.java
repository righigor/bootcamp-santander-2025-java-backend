// Escreva um codigo que receba o nome e a idade de duas pessoas e imprima a diferenca entre elas

import java.util.Scanner;

public class Exec4 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite seu nome");
    String name1 = scanner.next();
    System.out.println("Idade:");
    int age1 = scanner.nextInt();
    System.out.println("Outro nome");
    String name2 = scanner.next();
    System.out.println("idade: ");
    int ag2 = scanner.nextInt();
    System.out.println("A diferenca de idades é " + (age1 - ag2));

  }
}
