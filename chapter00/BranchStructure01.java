// 出票系统 根据淡季旺季的月份和年龄计算票价
// 4-10月为旺季
// 成人（18-60）:60
// 儿童（0-17）：半价
// 老人（61-100）：1/3
// 3-4月和11-12月为淡季
// 成人：40
// 其他：20

import java.util.Scanner;

public class BranchStructure01 {
  public static void main(String[] args) {
    // 获取年龄
    System.out.println("请输入年龄:");
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    // 获取月份
    System.out.println("请输入月份:");
    int month = sc.nextInt();
    // 定义票价
    double money = 0;

    // 判断季节
    if (month >= 4 && month <= 10) {
      // 判断年龄
      if (age >= 18 && age <= 60) {
        money = 60;
        System.out.println("本季节为旺季，成人票价为" + money);
      } else if (age < 17) {
        money = 60.0 / 2;
        System.out.println("本季节为旺季，儿童票价为" + money);
      } else {
        money = 60 * (1.0 / 3);
        System.out.println("本季节为旺季，老人票价为" + money);
      }
    } else {
      if (age >= 18 && age <= 60) {
        System.out.println("本季节为淡季，成人票价为40");

      } else {
        System.out.println("本季节为淡季，儿童票和老人票价为20");
      }
    }
  }
}
