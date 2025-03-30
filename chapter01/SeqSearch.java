import java.util.Scanner;

public class SeqSearch {

  public static void main(String[] args) {
    // 顺序查找
    // 遍历数组 逐一比较是否相等 如果相等 退出循环

    // 先定义原始数组
    String[] str = {"北京", "上海", "深圳", "库尔勒"};

    // 创建Scanner对象接收用户输入
    Scanner sc = new Scanner(System.in);

    // 输出提示信息并创建变量保存用户输入
    System.out.println("请输入你所在城市：");
    String name = sc.next();

    // 遍历数组并逐一比较是否相等
    for (int i = 0; i < str.length; i++) {
      if (str[i].equals(name)) {
        System.out.println("已找到，所在下标为" + i);
        break;
      } else if (i == str.length - 1) { // 如果i已经到了最后一个元素依然没有找到
        System.out.println("当前数组没有你的城市");
      }
    }
    // 这里判断是否找到还有一种思路比较常用
    // 就是定义一个index初始化为-1
    // 然后在判断相等那个if中使index等于当前下标
    // 如果index改变了 那么就代表找到了 如果没有改变那就是没有找到
    // int index = -1;
    // if (str[i].equals(name)) {
    //    ...
    //    index = i;
    // }
    //
    // if (index == -1) {
    //    // 则没有找到
    // }
    // 这种思路在开发中判断是否改变很常用

    sc.close();
  }
}
