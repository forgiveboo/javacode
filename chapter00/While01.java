// 打印1-100之间所有能被3整除的数 使用while循环
public class While01 {
  public static void main(String[] args) {
    // 1. 打印1-100的数
    int i = 1; // 循环变量初始化
    while (i <= 100) {
      // 2. 判断是否能被3整除
      if (i % 3 == 0) {
        System.out.println(i);
        i++; // 循环变量迭代
      }
      i++;
    }
  }
}
