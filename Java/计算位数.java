import java.util.Scanner;
public class 计算位数{
    public static void main(String[] args) {
           System.out.println("请输入数字:");
           Scanner san = new Scanner(System.in);
           int san_2 = san.nextInt();
           if (san_2 < 10) {
               System.out.println("个位：" + san_2);
               san.close();
               return;
           }
           if (san_2 < 100) {
               System.out.println("个位："+ san_2 % 10);
               System.out.println("十位："+ san_2 / 10);
               san.close();
               return;
           }
           if (san_2 < 1000) {
               System.out.println("个位："+ san_2 % 10);
               System.out.println("十位："+ san_2 / 10 % 10);
               System.out.println("百位："+ san_2 / 100);
               san.close();
               return;
           }
           if (san_2 < 10000) {
               System.out.println("个位："+ san_2 % 10);
               System.out.println("十位："+ san_2 / 10 % 10);
               System.out.println("百位："+ san_2 / 100 % 10);
               System.out.println("千位："+ san_2 / 1000);
               san.close();
               return;
           }
           san.close();
    }
}