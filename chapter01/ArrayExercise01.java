public class ArrayExercise01 {
  public static void main(String[] args) {
    // 创建一个char类型的数组 存放26个大写字母
    // 访问所有元素并输出
    // 定义数组
    char[] chars = new char[26];

    // 先对数组进行遍历赋值
    for (int i = 0; i < chars.length; i++) {
      // A+1 --> B
      chars[i] = (char) ('A' + i);
    }

    // 遍历输出
    for (int i = 0; i < chars.length; i++) {
      System.out.println(chars[i]);
    }
  }
}
