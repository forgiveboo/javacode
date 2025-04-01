public class MethodExercise01 {

  public static void main(String[] args) {
    // 编写一个类 其中有一个方法可以实现如下功能
    // 判断一个数是奇数还是偶数 返回boolean

    // 创建一个B类对象
    B b = new B();

    boolean flag = b.oddAndEven(15);
    if (flag) {
      System.out.println("是偶数");
    } else {
      System.out.println("是奇数");
    }
  }
}

// 先创建一个类
class B {
  // 定义一个方法
  public boolean oddAndEven(int n) {
    if (n % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }
  // 当我们在准备写一个方法时 可以通过以下几步理清思路
  // 1. 方法的返回类型是什么
  // 2. 方法名是什么
  // 3. 方法需要哪些参数
  // 4. 方法的实现（方法体怎么写）
}
