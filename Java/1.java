import java.util.Scanner;
import java.util.InputMismatchException;

public class 1 {
    public static void main(String[] args) {
        // 使用try-with-resources自动管理Scanner资源
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("请输入数字:");
            
            int number;
            try {
                number = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("输入错误，请输入有效的整数！");
                return;
            }
            
            // 负数处理（如果需要）
            if (number < 0) {
                System.out.println("负数的位数分析：");
                number = Math.abs(number); // 取绝对值进行分析
            }
            
            // 提取各位数字（无论位数多少都先计算）
            int ge = number % 10;
            int shi = (number / 10) % 10;
            int bai = (number / 100) % 10;
            int qian = (number / 1000) % 10;
            
            // 根据位数输出对应结果
            if (number < 10) {
                System.out.println("个位：" + ge);
            } else if (number < 100) {
                System.out.println("个位：" + ge);
                System.out.println("十位：" + shi);
            } else if (number < 1000) {
                System.out.println("个位：" + ge);
                System.out.println("十位：" + shi);
                System.out.println("百位：" + bai);
            } else if (number < 10000) {
                System.out.println("个位：" + ge);
                System.out.println("十位：" + shi);
                System.out.println("百位：" + bai);
                System.out.println("千位：" + qian);
            } else {
                System.out.println("输入的数字超过四位数！");
            }
        } // 这里自动关闭Scanner，无需手动调用close()
    }
}
