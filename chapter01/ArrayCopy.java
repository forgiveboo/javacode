public class ArrayCopy {
  public static void main(String[] args) {
    // 数组拷贝 要求数据空间相互独立 也就是两个数组指向不同的地址

    // 这个该怎么做呢
    // 首先想到的是定义两个长度相同的数组 然后通过访问元素和元素之间赋值来进行拷贝
    // 其中一个进行静态初始化 另外一个根据前一个的长度进行动态初始化
    int[] arr1 = {1, 4, 9, 8, 199};
    int[] arr2 = new int[arr1.length];

    // 那怎么来进行拷贝呢
    // 循环遍历arr1 将arr1的元素都拷贝给arr2
    for (int i = 0; i < arr1.length; i++) {
      arr2[i] = arr1[i];
    }

    // 输出看看
    for (int i = 0; i < arr2.length; i++) {
      System.out.println(arr2[i]);
    }

    // 再来看看改变arr1的元素值会不会改变arr2的元素值
    System.out.println("=========================");
    arr1[0] = 10;
    for (int i = 0; i < arr2.length; i++) {
      System.out.println(arr2[i]);
    }
    // ok 没有改变 完成！！！
  }
}
