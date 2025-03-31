public class Method01 {

  public static void main(String[] args) {
    // 成员方法
    // 成员方法是对象行为的实现方式
    // 成员方法也叫方法
    // 方法快速入门
    // 创建一个Person类 并创建一个方法使其对象可以输出一条语句“我是个好人”

    // 方法的调用
    // 1. 先创建一个Person对象
    Person p = new Person();
    // 2. 使用对象来调用方法
    p.speak();

    // 调用cal01方法
    p.cal01();

    // 调用cal02方法
    p.cal02(100);

    // 调用getSum方法
    int sum = p.getSum(10, 20);
    System.out.println("getSum的返回值=" + sum);
  }
}

// 创建Person类
class Person {
  String name;
  int age;

  // 创建方法
  public void speak() {
    System.out.println("我是个好人");
  }

  // 上面这段代码怎么理解呢
  // 1. public 表示这个方法是公开的
  // 2. void 表示该方法没有返回值
  // 3. speak() speak是方法名 ()里放的是形参列表 此处留空表示该方法没有参数
  // 4. System.out.println("我是一个好人");是方法体 用来实现方法的功能

  // 创建一个方法 可以计算1-1000的和
  public void cal01() {
    int sum = 0;
    for (int i = 1; i <= 1000; i++) {
      sum += i;
    }
    System.out.println("1-1000的和=" + sum);
  }

  // 创建一个方法 可以接受用户传入的参数计算1-x的和
  public void cal02(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += i;
    }
    System.out.println("1-" + n + "的和=" + sum);
  }

  // 上面的int n怎么理解呢
  // ()中为形参列表 此时列表中有一个int类型的参数
  // 在调用该方法时 需要传入对应数据类型的值才可以正确的调用方法
  // 可以理解为使用工具时必须要给工具提供相应的条件才可以使用

  // 创建一个方法 可以计算用户传入的两个数的值
  public int getSum(int num1, int num2) {
    int sum = num1 + num2;
    return sum;
  }
  // 上面的return sum怎么理解呢
  // 之前我们的方法的返回值都是void 这就表示我们的方法没有返回值
  // 但是这个方法的返回值为int 就代表该方法要返回一个int类型的值
  // 这里的return sum就是把sum的值返回给调用该方法的对象
  // 通常有返回值的方法在调用时都需要用一个跟返回值类型一致的变量来接收
  // 另外需要注意的是 当形参列表中有多个参数时 传入的参数和形参列表中是一一对应的关系
  // 当程序执行到return时 系统会将该方法在栈中的空间销毁

}
