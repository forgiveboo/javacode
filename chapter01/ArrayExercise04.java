public class ArrayExercise04 {

  public static void main(String[] args) {
    // 随机生成1-100的整数保存到数组
    // 并倒序打印 且求其平均值 最大值和最大值下标

    // 先定义一个大小为10的数组
    int[] nums = new int[10];

    // 遍历该数组并s生成随机数进行赋值
    for (int i = 0; i < nums.length; i++) {
      nums[i] = (int) (Math.random() * 100) + 1;
    }

    // 输出
    System.out.println("当前nums中的元素：");
    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i] + "\t");
    }

    // 倒序输出
    System.out.println("\n倒序输出:");
    for (int i = nums.length - 1; i >= 0; i--) {
      System.out.print(nums[i] + "\t");
    }

    // 求平均值
    // 先定义一个变量来保存和
    double sum = 0;
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
    }
    System.out.println("\n平均值=" + (sum / nums.length));

    // 求出最大值和最大值的下标
    // 先定义一个变量保存最大值
    int maxNum = nums[0];
    // 定义一个数组保存index的值 定义为数组是因为后面还要用index
    int[] index = {-1, -2};
    for (int i = 1; i < nums.length; i++) {
      if (maxNum < nums[i]) {
        maxNum = nums[i];
        index[0] = i;
      }
    }
    System.out.println("\n最大值=" + maxNum + " 最大值下标=" + index[0]);

    // 查找该数组中是否有8
    // 使用顺序查找
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 8) {
        index[1] = i;
        System.out.println("该数组中有8, 下标为" + index[1]);
        break; // 一定要有break
      }
    }
    if (index[1] == -2) {
      System.out.println("没有找到8");
    }
  }
}
