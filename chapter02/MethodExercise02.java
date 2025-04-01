public class MethodExercise02 {

  public static void main(String[] args) {
    // 创建一个方法 实现以下功能
    // 根据行数和列数打印对应的字符
    // 例如：
    // 有4行4列 打印*
    // ****
    // ****
    // ****
    // ****
    //
    // 调用方法
    // 1. 创建方法所在类的对象
    C c = new C();
    c.print(5, 4, '*');
  }
}

// 先创建一个类
class C {
  // 写一个方法来实现业务逻辑
  // 1. 返回值？
  // 因为是要打印 所以不需要返回值 void
  // 2. 方法名？就叫print吧
  // 3. 形参列表？
  // 上面的需求一共有三个要素
  // 行数 列数 要打印的字符
  // 所以有三个形参 分别是 int int char
  // 4. 方法体
  // 就跟打印星星塔一样
  // 外层循环控制打印的行数
  // 内层循环控制每一行有多少列
  // 所以是个双重循环
  public void print(int raw, int col, char c) {
    for (int i = 1; i <= raw; i++) { // 控制打印层数
      for (int j = 1; j <= col; j++) { // 控制每一行有多少列
        // 打印字符
        System.out.print(c);
      }
      System.out.println();
    }
  }
}
