//Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e escolhe entre a opção par e impar, com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial) no intervalo de números informados, incluindo os números informados e em ordem decrescente;

import java.util.Objects;
import java.util.Scanner;

public class Exec03 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o primeiro numero:");
    int num1 = scanner.nextInt();
    System.out.println("Digite o segundo numero:");
    int num2 = scanner.nextInt();
    System.out.println("Escolha par ou impar: (P/I)");
    String parImpar = scanner.next();

    if (Objects.equals(parImpar, "P")) {
      showNumsPar(num1, num2);
    } else {
      showNumsImpar(num1,num2);
    }
  }

  public static void showNumsPar(int num1, int num2) {
    for (int i = num2; i >= num1 ; i--) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }
  }

  public static void showNumsImpar(int num1, int num2) {
    for (int i = num2; i >= num1 ; i--) {
      if (i % 2 != 0) {
        System.out.println(i);
      }
    }
  }
}
