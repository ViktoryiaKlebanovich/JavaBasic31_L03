package by.epam.unit03.main;

import java.util.Scanner;

public class Task07 {
  public static void main(String[] args) {
    Scanner sc;
    sc = new Scanner(System.in);
    String Roman, Arabic;
    System.out.print("Enter roman digit > ");
    Roman = sc.nextLine();
    System.out.println("Roman = " + Roman);
    switch (Roman) {
      case "I":
        Arabic = "1";
        break;
      case "II":
        Arabic = "2";
        break;
      case "III":
        Arabic = "3";
        break;
      case "IV":
        Arabic = "4";
        break;
      case "V":
        Arabic = "5";
        break;
      case "VI":
        Arabic = "6";
        break;
      case "VII":
        Arabic = "7";
        break;
      case "VIII":
        Arabic = "8";
        break;
      case "IX":
        Arabic = "9";
        break;
      case "X":
        Arabic = "10";
        break;
      default:
        Arabic = "Unknown";
        break;
    }
    System.out.println("Arabic = " + Arabic);
  }
}
