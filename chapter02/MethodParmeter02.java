public class MethodParmeter02 {

  public static void main(String[] args) {
    // 方法传参机制
    // 1. 对于引用类型来说
    // 先看案例
    //
    int[] arr = {1, 2, 3};

    AA aa = new AA();
    aa.f1(arr);

    System.out.println("main方法输出：");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + "\t"); // 输出 100 2 3
    }
    System.out.println();
  }
  // 为什么这次在f1方法中改变值 main方法中会跟着改变呢
  // 这其实和数组的拷贝是一个道理
  // 准确来说 引用类型的拷贝都是一样的 传递的都是一个地址 指向堆空间中的对应地址
  // 只要是传递一个引用 那么一定是地址拷贝 让两个对象指向同一个堆空间
  // 他们的数据空间是共用的 所以其中一个改变那么另一个指向该空间的对象一定会跟着变
}

class AA {
  // 写一个方法 该方法的形参是一个数组类型
  public void f1(int[] arr) {
    System.out.println("f1方法输出：");
    for (int i = 0; i < arr.length; i++) {
      arr[0] = 100;
      System.out.print(arr[i] + "\t"); // 输出 100 2 3
    }
    System.out.println();
  }
}
