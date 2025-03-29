public class ArrayReverse02 {
  public static void main(String[] args) {
    // 数组翻转另外一种实现 逆序赋值法
    // 先定义数组
    int[] arr = {11, 22, 33, 44, 55, 66};

    // 再定义一个数组 跟原数组长度一致
    int[] arr2 = new int[arr.length];

    // 逆序遍历arr数组 并顺序存入arr2数组
    // 这里又学到了 在for循环中循环变量可以有多个 变量迭代的语句也可以有多个
    for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
      arr2[j] = arr[i];
    }

    // 这一步很重要 让arr这个数组指向arr2这个数组
    // 这一步之后arr原来的地址就没有任何引用了 会被回收机制回收
    arr = arr2;

    // 输出arr看看
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
