// Escreva um código que receba um nome e o ano de nascimento de algume e imprima na tela a seguinte mensagem: "ola fulano voce tem x anos"

import java.time.OffsetDateTime;
import java.util.Scanner;

public class Exec1 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite seu nome:");
    String name = scanner.next();
    System.out.println("Digite seu ano de nascimento:");
    int year = scanner.nextInt();
    int age = OffsetDateTime.now().getYear() - year;
    System.out.println("Olá " + name + " você tem " + age + " anos");
  }
}
