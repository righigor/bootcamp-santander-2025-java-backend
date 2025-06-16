//Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do seu IMC(IMC = peso/(altura * altura)) e seja exibida a mensagem de acordo com o resultado:
//
//Se for menor ou igual a 18,5 "Abaixo do peso";
//se for entre 18,6 e 24,9 "Peso ideal";
//Se for entre 25,0 e 29,9 "Levemente acima do peso";
//Se for entre 30,0 e 34,9 "Obesidade Grau I";
//Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
//Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";

import java.util.Scanner;

public class Exec02 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite seu peso:");
    float peso = scanner.nextFloat();
    System.out.println("Digite seu peso:");
    float altura = scanner.nextFloat();

    float imc = getImc(peso, altura);
    showResult(imc);
  }
  public static float getImc(float peso, float altura) {
    return peso/(altura * altura);
  }

  public static void showResult(float imc) {
    if (imc < 18.5) {
      System.out.println("Abaixo do peso");
    } else if (18.6 < imc && imc < 24.9) {
      System.out.println("Peso ideal");
    } else if (25.0 < imc && imc < 29.9) {
      System.out.println("Levemente acima do peso");
    } else if (30.0 < imc && imc < 34.9) {
      System.out.println("Obesidade Grau I");
    } else if (35.0 < imc && imc < 39.9) {
      System.out.println("Obesidade Grau II (Severa)");
    } else {
      System.out.println("Obesidade III (Mórbida)");
    }
  }

}
