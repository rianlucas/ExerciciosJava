import java.util.Scanner;

public class Questao01 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Digite um número:");
    double num = input.nextDouble();

    System.out.println("Escolha a operação que deseja realizar:");
    System.out.println("1 - Adição");
    System.out.println("2 - Subtração");
    System.out.println("3 - Multiplicação");
    System.out.println("4 - Divisão");
    System.out.println("5 - Potenciação");
    System.out.println("6 - Raiz quadrada");
    System.out.println("7 - Raiz cúbica");
    System.out.println("8 - Todas as operações");

    int opcao = input.nextInt();

    switch (opcao) {
      case 1 -> {
        System.out.println("Digite o número que deseja somar:");
        double num2 = input.nextDouble();
        System.out.println("O resultado da soma é: " + (num + num2));
      }
      case 2 -> {
        System.out.println("Digite o número que deseja subtrair:");
        double num3 = input.nextDouble();
        System.out.println("O resultado da subtração é: " + (num - num3));
      }
      case 3 -> {
        System.out.println("Digite o número que deseja multiplicar:");
        double num4 = input.nextDouble();
        System.out.println("O resultado da multiplicação é: " + (num * num4));
      }
      case 4 -> {
        System.out.println("Digite o número que deseja dividir:");
        double num5 = input.nextDouble();
        if (num5 != 0) {
          System.out.println("O resultado da divisão é: " + (num / num5));
        } else {
          System.out.println("Não é possível dividir por zero!");
        }
      }
      case 5 -> {
        System.out.println("Digite a potência desejada:");
        double potencia = input.nextDouble();
        System.out.println("O resultado da potenciação é: " + Math.pow(num, potencia));
      }
      case 6 -> System.out.println("O resultado da raiz quadrada é: " + Math.sqrt(num));
      case 7 -> System.out.println("O resultado da raiz cúbica é: " + Math.cbrt(num));
      case 8 -> {
        System.out.println("Digite o número que deseja somar:");
        double num6 = input.nextDouble();
        System.out.println("O resultado da soma é: " + (num + num6));
        System.out.println("Digite o número que deseja subtrair:");
        double num7 = input.nextDouble();
        System.out.println("O resultado da subtração é: " + (num - num7));
        System.out.println("Digite o número que deseja multiplicar:");
        double num8 = input.nextDouble();
        System.out.println("O resultado da multiplicação é: " + (num * num8));
        System.out.println("Digite o número que deseja dividir:");
        double num9 = input.nextDouble();
        if (num9 != 0) {
          System.out.println("O resultado da divisão é: " + (num / num9));
        } else {
          System.out.println("Não é possível dividir");

        }
      }
    }
  }
}