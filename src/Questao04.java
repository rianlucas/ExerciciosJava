import java.util.Scanner;

public class Questao04 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Digite um numero: ");
    int numero = input.nextInt();

    if (numero % 2 == 0) {
      System.out.println("O numero e par, e a raiz cubica dele e: " + numero * numero * numero);
      return;
    }
    System.out.println("O numero e impar, e a raiz quadrada dele e: " + numero * numero);


  }
}
