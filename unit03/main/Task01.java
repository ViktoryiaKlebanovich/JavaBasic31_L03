package by.epam.unit03.main;

public class Task01 {
  public static void main(String[] args) {
    int x = 3;
    int y = 1;
    System.out.println("Таблица умножения на 3:");
    for (int i = y; i <= 9; i++) {
      System.out.println("3 * " + i + " = " + x * y++);
    }

  }
}
