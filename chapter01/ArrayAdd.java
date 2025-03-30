import java.util.Scanner;

public class ArrayAdd {

  public static void main(String[] args) {
    // 数组扩容
    // 实现动态的给数组添加元素
    // 要求：
    // 1. 原始数组使用静态初始化 int[] arr = {1, 2, 3};
    // 2. 增加的元素直接放到数组的最后 arr = {1, 2, 3, 4};
    // 3. 用户可以通过输入y/n来决定是否要继续添加

    // 先定义原始数组
    int[] arr = {1, 2, 3};

    // 现在要实现用户自己选择是否继续添加 那么肯定是用循环啦
    // 首先定义一个Scanner对象接收用户输入
    Scanner sc = new Scanner(System.in);

    // 然后用do-while循环将下面的步骤包起来
    do {
      // 使用动态初始化定义一个比原始数组多一个元素的新数组
      int[] newArr = new int[arr.length + 1];

      // 将原始数组的元素循环拷贝到新数组
      for (int i = 0; i < arr.length; i++) {
        newArr[i] = arr[i];
      }

      // 输出提示信息
      System.out.println("请输入要添加的元素值：");

      // 将要添加的元素赋值给newArr最后一个元素
      newArr[newArr.length - 1] = sc.nextInt();

      // 将arr数组指向newArr数组
      arr = newArr;

      // 循环输出arr看看
      for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
      }

      // 询问用户是否继续添加
      System.out.println("是否继续添加(y/n)");
      char answer = sc.next().charAt(0);
      // 使用if判断 如果为n的话就退出循环
      if (answer == 'n') {
        break;
      }
    } while (true);
    sc.close();
  }
}
