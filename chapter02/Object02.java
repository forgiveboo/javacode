public class Object02 {

  public static void main(String[] args) {
    // 属性的使用细节
    // 1. 属性的定义和变量一致 只不过多了个访问修饰符
    // 2. 访问修饰符 数据类型 属性名
    // 3. 访问修饰符是用于限制属性的访问范围的
    // 4. 属性的数据类型可以是任意数据类型
    // 5. 属性如果不赋值有默认值 默认值和数组的规则一致

    // 创建一个Person实例
    Person p1 = new Person();
    // 这里要说明：
    // p1只是一个对象引用(对象名) 真正的对象是new Person()[真正的数据是存放在这里的]
    // 就好比一个婴儿出生
    // 真正的人是这个婴儿
    // 而父母给婴儿取的名字就是对象名 也叫对象引用

  }
}

// 创建一个Person类
class Person {
  String name;
  int age;
  boolean isPass;
}
