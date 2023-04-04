import java.util.Scanner;

public class Questao03 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Digite seu nome e sobrenome: ");
    String nome = input.nextLine();
    String[] novoNome= nome.split("[,.!?'@_] *| +");

    for (int i = 0; i < novoNome.length; i++) {
      if (novoNome[i].equals("Wayne")) {
        System.out.println("Acesso liberado!");
        return;
      } else if (novoNome[i].equals("Kent")) {
        System.out.println("Sai dai mane");
        return;
      } else if (novoNome[i].equals("Diana")) {
        System.out.println("Bem vinda, Princesa Themyscara");
        return;
      }

    }
    System.out.println("Cai fora");

  }
}
