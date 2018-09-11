import java.util.Scanner;

public class Main {
    // 阶乘的数据
    private static int[] FACTORIAL = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < N; i++) {
            String message = scanner.nextLine();
            char[] array = message.toCharArray();
            System.out.println(cantor(array, message.length()) + 1);
        }
    }

    private static int cantor(char[] array, int n) {
        int x = 0;
        for (int i = 0; i < n; ++i) {
            int smaller = 0;  // 在当前位之后小于其的个数
            for (int j = i + 1; j < n; ++j) {
                if (array[j] < array[i])
                    smaller++;
            }
            x += FACTORIAL[n - i - 1] * smaller; // 康托展开累加
        }
        return x;  // 康托展开值
    }
}