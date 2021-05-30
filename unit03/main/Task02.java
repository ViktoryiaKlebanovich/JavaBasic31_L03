package by.epam.unit03.main;

public class Task02 {
  public static void main(String[] args) {
    int x = 1;
    int y = 99;
    int sum = 0;
    while (x <= y) {

      if (x % 2 == 1) {
        sum = sum + x;
      }
      x++;
    }
    System.out.println("Cумма всех нечетных чисел в диапазоне от 1 до 99 включительно:\n" + sum);
  }
}