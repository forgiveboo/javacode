public class TwoDimensionalArray02 {

  public static void main(String[] args) {
    // 二维数组的使用
    // 1. 动态初始化 类型[][] 数组名 = new 类型[大小][大小];
    int[][] arr = new int[2][3]; // 表示这个二维数组中有2个一维数组 每个一维数组中有3个元素

    // 遍历二维数组
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
}
