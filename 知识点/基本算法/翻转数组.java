import java.util.Scanner;

/**
 * Created by handsome programmer.
 * User: chen
 * Date: 2018/9/7
 * Time: 4:04
 * Description:
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long[] array = new long[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextLong();
        }
        int end = 0;
        int start = 0;
        int temp = array.length - 1;
        // 寻找开始位置
        for (int i = 0; i < temp; i++) {
            if (array[i + 1] < array[i]) {
                start = i;
                break;
            }
        }
        // 寻找结束位置
        for (int i = temp; i > 0; i--) {
            if (array[i - 1] > array[i]) {
                end = i;
                break;
            }
        }
        if (start == end) {
            System.out.println("no");
        } else {
            boolean flag = true;
            temp = (start + end) / 2;
            // 将中间反序的数组片段翻转过来
            for (int s = start, e = end; s < e; s++, e--) {
                long t = array[s];
                array[s] = array[e];
                array[e] = t;
            }
            // 检查是否符合升序数组
            for (int i = array.length - 1; i > 0; i--) {
                if (array[i] <= array[i - 1]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
