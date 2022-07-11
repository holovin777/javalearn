public class Br {
  static void myMethod(String fname, int age) {
    System.out.println(fname + " Refsnes" + " is " + age);
  }
  static int returnMethod(int x, int y) {
    return x + y;
  }
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      if (i == 4) {
      continue;
      }
      System.out.println(i);
    }
    myMethod("Liam", 20);
    myMethod("Jenny", 45);
    System.out.println(returnMethod(3, 5));
  }
}
