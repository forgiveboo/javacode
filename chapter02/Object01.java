public class Object01 {
  public static void main(String[] args) {
    // 类与对象
    // 对象有两大要素：属性和行为
    // 类就是一种数据类型 程序员自己创建的数据类型
    // 对象就是该数据类型的一个实例
    // Java最大的特点就是面对对象
    // 把一个大类的事物中的共同属性和行为提取出来 就可以创建一个类
    // 把每个实例的属性和行为具体化就可以创建一个该类的实例
    // 类是抽象的 概念的 是一种数据类型
    // 对象是具体的 实际的 代表一个具体的事物 即实例
    // 类是对象的模板 对象是类的一个个体 对应一个实例
    // 属性也叫成员变量
    //
    // 快速入门 养猫问题
    // 张奶奶有一只小猫 白色 3岁 名叫小花
    // 李奶奶也有一只猫 黑色 10岁 名叫小黑
    // 现在我需要分别得到这两只猫的属性
    //
    // 现在需要创建一只具体的猫
    Cat cat1 = new Cat(); // 创建了一个猫类的实例
    // 现在就可以通过cat1来访问这只猫的属性并给对应的属性赋值了
    cat1.name = "小花";
    cat1.age = 3;
    cat1.color = "白色";
    // 再创建一只猫cat2
    Cat cat2 = new Cat();
    cat2.name = "小黑";
    cat2.age = 10;
    cat2.color = "黑色";

    // 现在就可以使用这两只猫实例的属性了
    System.out.println("张奶奶的猫属性如下：");
    System.out.println(cat1.name + " " + cat1.age + " " + cat1.color);
    System.out.println("李奶奶的猫属性如下：");
    System.out.println(cat2.name + " " + cat2.age + " " + cat2.color);
  }
}

// 第一步 创建一个猫类
class Cat {
  // 提供猫类的共同属性
  String name;
  int age;
  String color;
}
