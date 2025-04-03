public class RecursionExercise01 {

  public static void main(String[] args) {
    // 使用递归求对应位置的斐波那契数是多少
    //
    AA aa = new AA();
    int n = 5;
    int num = aa.fibonacciSeq(n);
    if (num != -1) {
      System.out.println("第" + n + "个斐波那契数=" + num);
    }
  }
}

class AA {
  // 创建方法打印斐波那契数列
  // 1. 返回值 int
  // 2. 方法名 fibonacciSeq
  // 3. 形参列表 int n
  // 4. 方法体：
  // （1）斐波那契数列是1 1 2 3 5 8 13...
  // （2）第一个和第二个数都是1
  // （3）从第三个数开始 当前数是前两个数的和
  // 为什么使用递归呢
  // 因为假设我们要求第6个斐波那契数是多少
  // 那我们得知道第五个和第四个数是多少
  // 要求第五个是多少 要求第四个和第三个是多少
  // ...
  // 就是不用的往前推倒 这就很符合递归的应用场景了
  // 因为递归的执行流程就是从顶往下走的
  //
  public int fibonacciSeq(int n) {

    if (n >= 1) {
      // 第一个数和第二个数都是1
      if (n == 1 || n == 2) {
        return 1;
      } else {
        // 如果不是第一个数和第二个数 那么就斐波那契数就是前两个数的和
        return fibonacciSeq(n - 1) + fibonacciSeq(n - 2);
      }
    } else {
      System.out.println("输入有误");
      return -1;
    }
  }
}
