public class MethodParmeter01 {

  public static void main(String[] args) {
    // 方法传参机制
    // 1. 对于基本数据类型来说
    // 先看案例
    //
    int a = 10;
    int b = 20;

    AA aa = new AA();
    aa.swap(a, b);
    System.out.println("main方法中的a和b的值：a=" + a + "b=" + b); // 输出a=10 b=20
    // 为什么main方法中a和b的值没有改变呢
    // 因为java程序在传递基本数据类型的参数时 采用的传递方式是值拷贝
    // 也就是说是把值直接传过去 而不是传地址
    // 所以形参的任何改变都不会影响实参
    //
  }
}

class AA {
  // 这里有一个方法 该方法有两个参数
  public void swap(int a, int b) {
    System.out.println("a和b交换前的值：a=" + a + " b=" + b); // 输出 a=10 b=20
    int temp = a;
    a = b;
    b = temp;
    System.out.println("a和b交换后的值: a=" + a + " b=" + b); // 输出 a=20 b=10
  }
}
