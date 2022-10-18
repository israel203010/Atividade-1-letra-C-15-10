import java.util.Scanner;

class Main {
  public static double media(double a, double b, double c) {
    return ((a + b + c) / 3);
  }

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("digite o valor do primeiro numero ");
    double a = entrada.nextInt();
    System.out.println("digite o valor de b");
    double b = entrada.nextInt();
    System.out.println("digite o valor de c");
    double c = entrada.nextInt();
    System.out.println("a media desses numeros é:" + media(a, b, c));
  }
}