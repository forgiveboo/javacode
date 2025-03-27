// 打印空心金字塔
/*        *       1
 *       * *      2
 *      *   *     3
 *     *******    4
 *  
 */

import java.util.Scanner;

public class MulFor03 {
  public static void main(String[] args) {
    // 1. 先打印实心金字塔
    /*
     *   *
     *   **
     *   ***
     *   ****
    */
    // for (int i = 1; i <= 4; i++) {  // 控制层数
    //   for (int j = 1; j <= i; j++) { // 控制星星数
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }

     /* 2. 打印等腰三角的金字塔
     *     *
     *    ***
     *   *****
     *  *******
     */
    // for (int i = 1; i <= 4; i++) { // 控制层数
    //   for (int k = 1; k <= 4 - i; k++) { // 控制空格
    //     System.out.print(" ");
    //   }
    //   for (int j = 1; j <= 2 * i - 1; j++) {
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }
     /*
     * 3. 打印空心金字塔
     *      *
     *     * *
     *    *   *
     *   *******
     */
    Scanner input = new Scanner(System.in);
    System.out.println("请输入层数：");
    int layer = input.nextInt();
    for (int i = 1; i <= layer; i++) { // 控制层数
      for (int k = 1; k <= layer - i; k++) {  // 控制空格
        System.out.print(" ");
      }
      for (int j = 1; j <= 2 * i - 1; j++) { // 控制星数
        if (j == 1 || j == 2 * i - 1 || i == layer) { // 判断当前j的位置 如果位于第一个或最后一个就打印*
          System.out.print("*");
        } else { // 否则打印空格
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    input.close();
  }
}
