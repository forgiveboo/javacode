// 使用switch把小写字母改成大写字母

import java.util.Scanner;

public class BranchStructure02 {
  public static void main(String[] args) {
    // 1. 接收用户输入
    System.out.println("请输入一个小写字母(a-e)：");
    Scanner input = new Scanner(System.in);
    // 2. 定义一个变量保存输入
    // 这里有一个知识点 想要获取用户输入的字符 就是下面的语法
    char c = input.next().charAt(0);
    // 2. 使用switch判断用户输入
    switch (c) {
      case 'a':
        System.out.println("A");
        break;
      case 'b':
        System.out.println("B");
        break;
      case 'c':
        System.out.println("C");
        break;
      case 'd':
        System.out.println("D");
        break;
      case 'e':
        System.out.println("E");
        break;
      default:
        System.out.println("输入有误！");
        break;
    }
    input.close();

  }
}
