// 判断用户登录 如果用户名为 fengj 密码为666 则提示登录成功
// 一共三次机会 如果输错 提示登录失败并显示剩余登录次数

import java.util.Scanner;

public class Break02 {
  public static void main(String[] args) {
    /*
     * 1. 先提示用户输入账号和密码
     * 2. 将账号密码保存到一个变量
     * 3. 使用for循环来实现三次登录机会
     * 4. 当用户的账号和密码输入正确 使用break提前退出循环
     */
    String USER_NAME = "fengj";
    String PASSWORD = "666";
    String userName = "";
    String password = "";
    int chance = 3;
    Scanner input = new Scanner(System.in);
    for (int i = 1; i <= chance; i++) {
      // 提示用户输入
      System.out.println("请输入用户名：");
      userName = input.next();
      System.out.println("请输入密码：");
      password = input.next();
      // 判断用户输入是否正确
      if (USER_NAME.equals(userName) && PASSWORD.equals(password)) {
        System.out.println("登录成功");
        break;
      } else {
        System.out.println("还剩下" + (chance - i) + "次机会");
      }
    }
    input.close();
  }
}
