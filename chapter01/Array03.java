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
    // 数组的下标从0开始
    for (int i = 0; i < scores.length; i++) {
      System.out.println("请输入第" + (i + 1) + "个成绩：");
      scores[i] = sc.nextDouble();
    }

    for (int i = 0; i < scores.length; i++) {
      System.out.println("第" + (i + 1) + "个成绩是：" + scores[i]);
    }
    sc.close();

    // 也可以先声明数组 再分配空间
    // 有些时候 我们不知道数组的具体长度 就可以这样使用
    int[] arr;
    // 分配空间
    arr = new int[5];

    // 还可以静态初始化
    int[] arr2 = {1, 2, 3, 4, 5};
  }
}
