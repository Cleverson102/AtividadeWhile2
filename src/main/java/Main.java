import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int zero = 0;
    System.out.println("Insira X:");
    int x = sc.nextInt();
    System.out.println("Insira Y:");
    int y = sc.nextInt();

    while (x != zero && y!= zero){
  
    if (x > zero && y > zero) {
      System.out.println("Primeiro Quadrante.");
    }
    if (x < zero && y > zero) {
      System.out.println("Segundo Quadrante.");
        }
        if (x < zero && y < zero) {
       System.out.println("Terceiro Quadrante.");
    }
    if (x > zero && y < zero) {
      System.out.println("Quarto Quadrante.");
     }

      System.out.println("Insira X: ");
        x = sc.nextInt();
      System.out.println(" Insira Y: ");
        y = sc.nextInt();
    sc.close();
    }
  }
}