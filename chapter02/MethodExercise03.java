public class MethodExercise03 {

  public static void main(String[] args) {
    // 创建一个方法 实现对象拷贝
    // 也就是我传入一个对象参数 在方法里实现对传入的对象的拷贝
    // 并且传入的对象和拷贝得到的对象数据空间要相互独立
    // 其实对象拷贝和数组拷贝原理都是一样的
    // 只不过现在和类啊对象啊伙在一起了而已

    // 先创建一个对象用于传入方法
    Person p = new Person();
    // 初始化属性
    p.name = "jack";
    p.age = 23;

    // 创建Tools对象来调用copyPerson方法
    Tools t = new Tools();

    // 调用并接收返回值
    Person p1 = t.copyPerson(p);

    // 输出看看
    System.out.println("p的属性情况" + "p.name=" + p.name + "p.age=" + p.age);
    System.out.println("p1的属性情况" + "p1.name=" + p1.name + "p1.age=" + p1.age);
    // 它俩输出应该是一样的
    // 因为p1的所有属性都通过copyPerson方法从p中复制过来了
    System.out.println(p == p1); // false
  }
}

// 提前准备一个Person类专门用来创建对象
class Person {
  String name;
  int age;
}

class Tools {
  // 返回回类型 Person
  // 参数列表 Person p
  // 方法名 copyPerson
  // 方法体：
  // 1. 先创建一个新对象用于拷贝时存放数据
  // 2. 将传入的对象的属性全部拷贝到新对象里
  // 3. 返回拷贝后的对象
  public Person copyPerson(Person p) {
    // 创建新对象
    Person p1 = new Person();
    // 将传入的对象的属性一一拷贝到新对象
    p1.name = p.name;
    p1.age = p.age;
    // 返回拷贝的对象
    return p1;
  }
}
