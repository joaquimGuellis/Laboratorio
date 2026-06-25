import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite a senha");
    String senha_1 = sc.nextLine();
    while (!senha_1.equals("java123")) {
      System.out.println("Digite a senha");
      senha_1 = sc.nextLine();
    }
    System.out.println("acesso liberado");
  }
}
