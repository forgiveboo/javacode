public class Method02 {

  // 为什么需要成员方法
  // 想象一个需求：
  // 1. 需要输出5个二维数组
  // 2. 用传统方法就是定义五个数组 分别遍历
  // 写过这个需求的都知道每次遍历其实代码都是差不多的 只有数组名不一样
  // 也就是代码中的重复语句很多
  // 使用成员变量就可以把这些重复的代码用一个方法封装起来 用户调用就可以了
  public static void main(String[] args) {
    // 通过调用成员方法就可以很简单快捷的实现上面的需求 不用些一大堆重复的代码
    Tools tool = new Tools();
    int[][] arr1 = {{1, 2}, {3, 4}, {5, 6}};
    tool.printArr(arr1);
    int[][] arr2 = {{7, 8}, {9, 10}};
    tool.printArr(arr2);

    // 使用成员方法的好处：
    // 1. 提高代码的复用性
    // 2. 让用户不需要关心内部的实现过程 只需要调用就可以了
  }
}

// 创建一个Tools类
class Tools {
  // Tools类里面有个方法 可以遍历并输出数组的值
  public void printArr(int[][] arr) {
    System.out.println("================");
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
}
