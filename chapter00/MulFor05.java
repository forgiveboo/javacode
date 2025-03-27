// 判断一个整数的范围
// 大于0 小于0 等于0

import java.util.Scanner;

public class MulFor05 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("请输入一个整数：");
    int num = input.nextInt();
    if (num > 0) {
      System.out.println("该整数大于0");
    } else if (num < 0) {
      System.out.println("该整数小于0");
    } else {
      System.out.println("该整数等于0");
    }
    input.close();
  }
}
