import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        // 如果你收到一个‘#’，那么你应该删掉一个你已经收到的字符，不包括‘#’；
        // 如果你收到‘@’，那么你应该把你收到的一整行都删掉。（‘#’和‘@’都为不可见字符。）
//        whli##ilr#e(s#*
        for (int i = 0; i < N; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            Stack<Character> stack = new Stack<>();
            String line = scanner.nextLine();
            char[] array = line.toCharArray();
            for (int j = 0; j < array.length; j++) {
                // 删除一个已经收到的字符不包括‘#’
                if (array[j] == '#') {
                    if (!stack.empty()) {
                        stack.pop();
                    }
                } else if (array[j] == '@') {
                    //把你收到的一整行都删掉
                    while (!stack.empty()) {
                        stack.pop();
                    }
                } else {
                    //将输入的字符入栈
                    stack.push(array[j]);
                }
            }
            while (!stack.empty()) {
                stringBuilder.append(stack.pop());
            }
            System.out.println(stringBuilder.reverse().toString());
        }
    }
}