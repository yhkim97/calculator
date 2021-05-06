import java.util.*;

class Calculator_s extends Calculator_m{
  public int devide(int a, int b) {
    int result = a%b;
    return result;
  }

  public int Square(double a, double b) {
    int result = Math.pow(a,b);
    return result;
  }
}