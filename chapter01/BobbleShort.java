public class BobbleShort {

  public static void main(String[] args) {
    // 冒泡排序 使数组中的元素进行顺序排列
    // 冒泡排序的特点：
    // 1. 需要经历length - 1次排序
    // 2. 每一轮排序都可以确定未排序中的最大数的位置
    // 3. 在每一轮排序中 当进行比较时 如果前面的数比后面的大 就进行交换
    // 4. 每一轮比较的次数都在减1
    // 其实冒泡排序就是在每一次排序中比较出最大的数放到最后

    // 先定义原始数组
    int[] arr = {23, 55, 76, 11, 9, 100};

    // 开始冒泡排序
    for (int i = 1; i <= arr.length - 1; i++) { // 控制排序次数
      for (int j = 0; j < arr.length - i; j++) {
        // 内层循环控制比较次数
        // 因为每一次排序（也就是外层循环）都会确定一个数的位置
        // 那么内层循环的循环次数就应该随着排序次数的增加而减少
        // 因为已经确定好位置的数不需要再进行比较

        // 如果前一个元素比后一个元素大 那么就进行交换
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }

    // 输出看看
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
