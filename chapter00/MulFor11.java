// 求1+(1+2)+(1+2+3)...(1+2+3+...+100)
public class MulFor11 {
  public static void main(String[] args) {
    int sum1 = 0;
    for (int i = 1; i <= 100; i++) {  // 控制项数
      for (int j = 1; j <= i; j++) {  // 控制操作数
        sum1 += j;  // 累加操作数
      }
    }
    System.out.println(sum1);
  }
}
