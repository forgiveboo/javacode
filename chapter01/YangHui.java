public class YangHui {

  public static void main(String[] args) {
    // 杨辉三角
    // 打印10行杨辉三角
    // 1
    // 1  1
    // 1  2  1
    // 1  3  3  1
    // 1  4  6  4  1
    // 1  5  10 10 5 1
    // 杨辉三角规律
    // 1. 每一行的元素和它所在行数一致
    // 2. 每一行的第一个元素和最后一个元素都是1
    // 3. 从第三行开始 中间的元素值是上一行的同一列元素和上一行的前一列元素的和

    // 定义一个二维数组
    int[][] yangHui = new int[10][]; // 因为每一行元素数量不确定 所以先不开辟空间

    // 开始遍历二维数组
    for (int i = 0; i < yangHui.length; i++) {
      // 给一维数组开空间
      yangHui[i] = new int[i + 1];

      // 遍历一维数组并赋值
      for (int j = 0; j < yangHui[i].length; j++) {
        // 判断是否为第一个元素或最后一个元素
        if (j == 0 || j == yangHui[i].length - 1) {
          yangHui[i][j] = 1;
        } else {
          // 如果是中间的元素
          yangHui[i][j] = yangHui[i - 1][j] + yangHui[i - 1][j - 1];
        }
      }
    }

    // 输出看看
    for (int i = 0; i < yangHui.length; i++) {
      for (int j = 0; j < yangHui[i].length; j++) {
        System.out.print(yangHui[i][j] + "\t");
      }
      System.out.println();
    }
  }
}
