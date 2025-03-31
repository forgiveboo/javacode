import java.util.Scanner;

public class ArrayExercise03 {

  public static void main(String[] args) {
    // 已知一个升序数组
    // 任意插入一个数 该数组依然是升序
    // 1. 第一步要找到插入的位置
    // 2. 第二部要把原始数组的元素值赋值给扩容后的数组
    // 并且要跳过需要插入的位置

    // 先定义一个升序数组
    int[] arr = {12, 34, 40, 90};

    // 创建Scanner对像接收用户输入
    Scanner sc = new Scanner(System.in);

    // 要确保插入一个数之后该数组还是升序数组
    // 那么就需要先确定要插入的位置
    // 定义一个index用来保存插入的下标
    int index = -1;

    // 输出提示信息
    System.out.print("请输入要插入的值：");
    // 定义一个数用来保存用户输入
    int insertNum = sc.nextInt();

    // 怎么确定呢 就是用insertNum来跟arr中的元素值进行比较
    // 当insertNum<=某个元素值时 就是我们需要插入的位置
    // 所以需要遍历arr数组让元素跟insertNum进行比较
    for (int i = 0; i < arr.length; i++) {
      if (insertNum <= arr[i]) {
        index = i; // 保存当前下标
        // 找到第一个大于等于insertNum的元素后就要退出循环
        // 因为整个数组是升序的 那么后面的元素一定大于insertNum
        break;
      }
    }

    // 如果所有元素都不大于等于insertNum 那么就说明我们应该将insertNum放到最后
    if (index == -1) { // index == -1就说明没有任何一个元素大于等于insertNum
      index = arr.length;
    }

    // 找到要插入的位置后就可以进行扩容了
    // 先定义一个新数组 长度为arr.length + 1
    int[] newArr = new int[arr.length + 1];

    // 要怎么把要插入的位置让出来给新元素呢
    // 可以循环遍历新数组 因为新数组比原始数组大 我们才有位置来插入新元素
    // 可以想象两个指针
    // i指针用于newArr j指针用于arr
    // i指针要在每次循环体执行后都往后走 但j指针只有满足当前位置不是我们要插入的位置才会往后走
    for (int i = 0, j = 0; i < newArr.length; i++) {
      if (index != i) { // 说明不是我们要插入的位置 那么就把arr[j]赋值给newArr[i]
        newArr[i] = arr[j];
        j++; // 让j指针往后走
      } else {
        newArr[i] = insertNum;
      }
    }

    // 现在就可以把arr指向newArr了
    arr = newArr;

    // 输出
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }

    sc.close();
  }
}
