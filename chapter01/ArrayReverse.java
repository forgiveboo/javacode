public class ArrayReverse {
  public static void main(String[] args) {
    // 数组翻转
    // int[] arr = {11, 22, 33, 44, 55, 66}; --> {66, 55, 44, 33, 22, 11}
    // 先定义数组
    int[] arr = {11, 22, 33, 44, 55, 66};

    // 可以把数组的最后一个元素和第一个元素的值进行交换
    // 需要注意的是 只需要交换数组的长度的一半的次数
    // 不然就又交换回去了
    for (int i = 0; i < arr.length / 2; i++) {
      int temp = arr[i]; // 先把第i个元素的值保存起来
      arr[i] = arr[arr.length - 1 - i]; // 把倒数的元素的值赋值给第i个元素
      arr[arr.length - 1 - i] = temp; // 再把第i个元素的值赋给倒数的元素
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
