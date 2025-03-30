import java.util.Scanner;

public class ArrayReduce {

  public static void main(String[] args) {
    // 数组缩减
    // 原始数组 int[] arr = {1, 2, 3, 4}; --> {1, 2, 3};

    // 先定义原始数组
    int[] arr = {1, 2, 3, 4};

    // 创建Scanner对象接收用户输入
    Scanner sc = new Scanner(System.in);

    // 使用do-while循环来实现让用户自行选择是否继续缩减
    do {
      // 定义一个新的数组 比原始数组长度少1
      int[] newArr = new int[arr.length - 1];

      // 循环遍历arr并赋值给newArr
      // 这里要注意的是 应该遍历newArr 因为newArr的长度小 这样不会导致下标越界异常
      for (int i = 0; i < newArr.length; i++) {
        newArr[i] = arr[i];
      }

      // 将arr指向newArr
      arr = newArr;

      // 输出原始数组
      for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
      }

      // 输出提示信息
      System.out.println("是否要继续缩减(y/n)");
      char answer = sc.next().charAt(0);

      // 使用if判断用户输入
      if (answer == 'n') {
        break; // 如果用户输入n 那么使用break提前结束循环
      } else { // 这里还需要判断一下arr数组当前的长度 如果没有空间了 也要结束
        if (arr.length == 1) {
          System.out.println("已经没有空间了 不能再继续缩减了");
          break;
        }
      }

    } while (true);

    sc.close();
  }
}
