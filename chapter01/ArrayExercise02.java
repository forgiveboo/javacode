import java.util.Scanner;

public class ArrayExercise02 {
  public static void main(String[] args) {
    // 求出int[] 数组中最大的数并得到对应的下标
    // 求该数组平均值
    int[] nums = new int[5];

    // 定义一个变量保存最大数
    int max = 0;
    // 定义一个变量保存下标
    int index = 0;

    // 定义一个变量保存sum 因为平均值可能是一个浮点数 所以定义为double类型
    double sum = 0;

    Scanner sc = new Scanner(System.in);

    // 遍历数组进行赋值
    for (int i = 0; i < nums.length; i++) {
      System.out.println("请输入第" + (i + 1) + "个元素值：");
      nums[i] = sc.nextInt();
    }

    // 遍历数组求出最大数并进行累加
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
      if (max < nums[i]) {
        max = nums[i];
        index = i;
      }
    }
    System.out.println("该数组最大数为" + max + " 对应下标为" + index);
    System.out.println("该数组平均数为" + sum / nums.length);
    sc.close();
  }
}
