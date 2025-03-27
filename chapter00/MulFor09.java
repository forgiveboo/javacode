// 输出小写的a-z及对应的A-Z
public class MulFor09 {
  public static void main(String[] args) {
    for (int i = 97; i <= 122; i++) {
      System.out.println((char)i + " " + (char)(i - 32));
    }
  }
}
