// 打印1-100之间无法被5整除的数 每行5个
public class MulFor08 {
  public static void main(String[] args) {
    int count = 0;
    for (int i = 1; i <= 100; i++) {
      if (i % 5 != 00) {
        count++;
        System.out.print(i + "\t");
        if (count % 5 == 0) {
          System.out.println();
        }
      }
    }
  }
}
