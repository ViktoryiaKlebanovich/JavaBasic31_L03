package by.epam.unit03.main;

import java.util.Scanner;

public class Task08 {

  public static void main(String[] args) {
    double x, y, z = 0;
    String sign;
    Scanner sc = new Scanner(System.in);
    while (true) {
      System.out.print("Enter value for x > ");
      if (sc.hasNext("#")) {
        System.out.print("The program is stopped");
        break;
      }
      while (!sc.hasNextDouble()) {
        System.out.print("Enter value for x > ");
        sc.nextLine();
      }
      x = sc.nextDouble();
      System.out.print("Enter value for y > ");
      if (sc.hasNext("#")) {
        System.out.print("The program is stopped");
        break;
      }
      while (!sc.hasNextDouble()) {
        System.out.print("Enter value for y > ");
        sc.nextLine();
      }
      y = sc.nextDouble();
      System.out.print("Enter the arithmetic sign (+,-,/,*):> ");
      if (sc.hasNext("#")) {
        System.out.print("The program is stopped");
        break;
      }
      sign = sc.next();
      switch (sign) {
        case "+":
          z = x + y;
          break;
        case "-":
          z = x - y;
          break;
        case "*":
          z = x * y;
          break;
        case "/":
          if (y == 0) {
            System.out.println("You cannot divide by 0!");
          } else {
            z = x / y;
          }
          break;
        default:
          System.out.println("Unknown sign");
          break;
      }
      System.out.println("Z = " + z);
    }
  }
}//Молодец. Зачтено


