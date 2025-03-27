// 求1-100 当和第一次大于20的时候的当前数
public class Break01 {
  public static void main(String[] args) {
    int sum = 0; // 保存和
    for (int i = 1; i <= 100; i++) {
      if (sum > 20) { // 判断当前sum的值
        System.out.println(i);
        break;
      } else {  // 如果不大于20那么就累加
        sum += i;
      }
    }
  }
}
