public class ArrayAssign {
  public static void main(String[] args) {
    // 数组的赋值机制
    // 1. 数组是引用传递 也就是地址拷贝
    // 2. 怎么理解呢 很简单 就是数组名指向的是一个地址 这个地址被jvm存放在栈内存中
    // 3. 每次我们在访问数组时 都是通过栈内存中的地址找到堆内存中的数据空间
    // 4. 那么当我们把一个数组直接赋值给另一个数组时 其实赋的就是这个数组在栈内存中存放的地址
    int[] arr1 = {1, 2, 3}; // 假设arr1指向0x001
    int[] arr2 = arr1; // 这里其实就是把这个0x001赋值给arr2 此时arr2和arr1指向同一个内存空间

    System.out.println("arr1的地址：" + arr1);
    System.out.println("arr2的地址：" + arr2);
    // 此时 输出的地址是一样的

    // 这样一来 改变其中任意一个数组的任意一个元素 另外一个数组都会随之改变
    System.out.println("========arr1之前的值==========");
    for (int i = 0; i < arr1.length; i++) {
      System.out.println(arr1[i]);
    }

    arr2[1] = 10;
    System.out.println("========arr1现在的值===========");
    for (int i = 0; i < arr1.length; i++) {
      System.out.println(arr1[i]);
    }
  }
}
