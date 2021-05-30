package by.epam.unit03.main;

public class Task03 {
  public static void main(String[] args){
    int x = 0;
    long y = 1;
    System.out.println("Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10):");
    for (int i = 1; i <= 10; i++) {
      x = x+i;
      y = y*x;
    }
    System.out.println(y);
  }
}
