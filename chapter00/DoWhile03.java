// 如果李三不还钱 就一直挨打 直到李三说出还钱为止

import java.util.Scanner;

public class DoWhile03 {
  public static void main(String[] args) {
    char answer = 'y';
    do {
      System.out.println("夺命连环抽~");
      System.out.println("还不还钱（y/n）");
      Scanner input = new Scanner(System.in);
      answer = input.next().charAt(0);
    } while (answer == 'n');
  }
}
