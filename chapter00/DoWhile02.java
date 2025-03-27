// 统计1-200之间能被5整除但不能被3整除的数的个数
public class DoWhile02 {
  public static void main(String[] args) {
    // 1. 打印1-200之间的数
    int i = 1;
    int count = 0;
    do {
      // 判断i是否能被5整除且不能被3整除
      if (i % 5 == 0 && i % 3 != 0) {
        count++;
      }
      i++;
    } while (i <= 200);
    System.out.println(count);
  }
}
