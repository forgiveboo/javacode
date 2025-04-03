public class Recursion01 {

  public static void main(String[] args) {
    // 方法的递归调用
    // 递归 简单来说就是自己调用自己
    // 直接看案例 求1-5的乘积

    AA aa = new AA();

    int res = aa.factoria(5);
    System.out.println("乘积=" + res);
  }
}

class AA {
  // 创建一个方法来计算乘积
  public int factoria(int n) {
    if (n == 1) {
      return 1;
    } else {
      return factoria(n - 1) * n;
    }
  }
  // 递归调用的执行逻辑
  // 1. 首先要明确 Java在调用方法时 都会在栈空间中开辟一个方法区
  // 2. 每个方法区相互独立
  // 3. 对于递归调用而言 只有当前次的语句全部执行完之后才会返回到上一次调用
  // 4. 总是先执行最顶上的调用 然后再依次返回
  // 5. 其实递归也是反复执行同一段代码 目前不理解它和循环的区别 我感觉没有区别
  // 6. 还要明确的是 return是谁调用就返回给谁 这样就好理解上面的代码了
}
