// 数组快速入门案例
// 循环输入5个成绩 并输出

import java.util.Scanner;

public class Array03 {
  public static void main(String[] args) {
    // 创建Scanner对象
    Scanner sc = new Scanner(System.in);

    // 定义一个数组保存输入的成绩
    double[] scores = new double[5];

    // 使用for循环遍历数组并输入成绩
    for (int i = 0; i < scores.length; i++) {
      System.out.println("请输入第" + (i + 1) + "个成绩：");
      scores[i] = sc.nextDouble();
    }
  }
}
