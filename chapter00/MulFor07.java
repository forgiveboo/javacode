// 判断一个数是否为水仙花数

import java.util.Scanner;

public class MulFor07 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("请输入一个整数：");
    int num = input.nextInt();
    int gw = num % 10;  // 取个位
    int sw = num / 10 % 10;  // 取十位
    int bw = num / 100; // 取百位
    int sum = gw * gw *gw + sw * sw * sw + bw * bw * bw;
    if (num == sum) {
      System.out.println("该数是水仙花数");
    } else {
      System.out.println("该数不是水仙花数");
    }
  }
}
