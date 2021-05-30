package by.epam.unit03.main;

public class Task06 {
  public static void main(String[] args) {

    int a = 36;
    int b = 13;
    int didgit1, didgit2, samedigits;
    for (int i = a; i > 0; i = i / 10) {
      didgit1 = i % 10;
      for (int j = b; j > 0; j = j / 10) {
        didgit2 = j % 10;
        if (didgit1 == didgit2) {
          samedigits = didgit1;
          System.out.println("samedigit is " + samedigits);
        }
        else {
          System.out.println("No samedigits");
        }
      }
    }
  }
}
