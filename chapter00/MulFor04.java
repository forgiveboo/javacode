// 某人有100000元 每经过一次路口 规则如下：
// 1. 当现金大于50000时 每次交5%
// 2. 当现金小于等于50000时每次交1000
// 要求使用 while-break来计算此人可以经过多少次路口
public class MulFor04 {
  public static void main(String[] args) {
    double money = 100000;
    int count = 0;
    while (true) {
      if (money > 50000) {
        money = money - money * 0.05;
        count++;
        System.out.println("此人经过第" + count + "次路口，还剩" + money + "元");        
      } else if (money <= 50000 && money >= 1000) {
        money -= 1000;
        count++;
        System.out.println("此人经过第" + count + "次路口，还剩" + money + "元");        
      } else {
        break;
      }
    }
  }
}
