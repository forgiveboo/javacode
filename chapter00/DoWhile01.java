// 计算1-100的和
public class DoWhile01 {
  public static void main(String[] args) {
    // 1. do-while就是不管条件为true还是false 都会执行一次
    // 2. 打印1-100
    int i = 1; // 循环变量初始化
    int sum = 0; // 存储和
    do {
      sum += i;
      i++; // 循环变量迭代
    } while (i <= 100);
    System.out.println(sum);
  }
}
