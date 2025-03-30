public class TwoDimensionalArray01 {

  public static void main(String[] args) {
    // 二维数组
    // 二维数组就是数组中的元素是一个数组
    // int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {11, 12, 13}};
    //
    // 快速入门
    // 使用二维数组输出以下效果
    // 0 0 0 1
    // 1 0 1 0
    // 2 3 4 5
    // 6 7 8 9

    // 先定义二维数组
    int[][] arr = {
      {0, 0, 0, 1},
      {1, 0, 1, 0},
      {2, 3, 4, 5},
      {6, 7, 8, 9},
    };

    // 遍历二维数组
    for (int i = 0; i < arr.length; i++) { // 遍历二维数组
      // 因为二维数组里面是一维数组
      // 所以如果要访问二维数组中某个一维数组的具体的某个元素值
      // 就需要对一维数组进行遍历
      for (int j = 0; j < arr[i].length; j++) { // arr[i]表示二维数组中第i个元素
        System.out.print(arr[i][j] + " "); // 访问二维数组中第i个元素的第j个元素值
      }
      System.out.println();
    }
  }
}
