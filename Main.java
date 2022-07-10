public class Main {
  public static void main(String[] args) {
    System.out.println("Hello, world!");
    byte smallNumber = 127;
    byte smallNegativeNumber = -128;
    short shortNumber = 32767;
    short shortNegativeNumber = -32768;
    int number = 2147483647;
    int negativeNumber = -2147483648;
    long longNumber = 9223372036854775807L;
    long longNegativeNumber = -9223372036854775808L;
    float floatNumber = 5.1234567f;
    double doubleNumber = 19.123456789d;
    System.out.println(floatNumber);
    boolean isJavaFun = true;
    boolean isFishTasty = false;
    System.out.println(isJavaFun);     // Outputs true
    System.out.println(isFishTasty);   // Outputs false
    char myGrade = 'B';
    System.out.println(myGrade);
    String txt = "Hello, world!";
    System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
    System.out.println(txt.toLowerCase());
    System.out.println(Math.random());
  }
}
