// 统计3个班的成绩 每个班5个人
// 1. 求各班平均分和所有班平均分
// 2. 求全年级及格人数
// 要求学生成绩用键盘输入

import java.util.Scanner;

public class MulFor02 {
  public static void main(String[] args) {
    // 首先创建一个Scanner对象
    Scanner input = new Scanner(System.in);
    int count = 0;
    double sum = 0; // 存储每个班的总成绩
    double nSum = 0; // 存储年级总成绩
    int classes = 3;
    int students = 5;
    for (int i = 1; i <= classes; i++) { // 控制班级个数
      for (int j = 1; j <= students; j++) { // 控制每个班人数
        System.out.println("请输入第" + i + "个班的第" + j + "个学生的成绩：");
        double score = input.nextInt();
        sum += score; // 求该班总成绩
        // 判断是否及格
        if (score >= 60) {
          // 如果及格则count加1
          count++;
        }
      }
      System.out.println("第" + i + "班的平均成绩为" + sum / students);
      nSum += sum;
      sum = 0;
    }
    System.out.println("年级总平均分为" + nSum / (classes * students));
    System.out.println("年级总及格人数" + count);
    input.close();
  }
}
