import java.util.Scanner;
class Area {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      System.out.println("Enter the radius of circle");
      int radius = sc.nextInt();
    System.out.println(3.14 * radius * radius);
  }
}
