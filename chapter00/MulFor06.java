// 判断一个年份是否为闰年

import java.util.Scanner;

public class MulFor06 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("请输入一个年份：");
    int year = input.nextInt();
    if (year % 4 == 0 && year % 1000 != 0) {
      System.out.println("该年是闰年");
    } else {
      System.out.println("该年不是闰年");
    }
  }
}
