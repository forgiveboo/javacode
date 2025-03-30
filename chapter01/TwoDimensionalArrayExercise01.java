public class TwoDimensionalArrayExercise01 {

  public static void main(String[] args) {
    // int[][] arr = {{1, 3, 6}, {6, 8, 11, 9}, {3, 6, 10}};
    // 遍历以上数组并求和
    int[][] arr = {{1, 3, 6}, {6, 8, 11, 9}, {3, 6, 10}};

    int sum = 0;
    // 开始遍历数组
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        sum += arr[i][j];
      }
    }
    System.out.println(sum);
  }
}
