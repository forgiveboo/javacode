// 求1-1/2+1/3-1/4+1/5...1/100
public class MulFor10 {
  public static void main(String[] args) {
    double sum1 = 0;
    double sum2 = 0;
    double sum = 0;
    for (int i = 1; i <= 100; i++) {
      if (i % 2 == 0) {
        sum1 = sum1 + (-1.0 / i);
      } else {
        sum2 = sum2 + (1.0 / i);
      }
    }
    sum = sum1 + sum2;
    System.out.println(sum);
  }
}
