import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String message = scanner.nextLine();
            int start = message.length() - 1, end = start;
            for (int i = message.length() - 1; i >= 0; i--) {
                if (message.charAt(i) == ' ') {
                    start = i + 1;
                    for (int j = start; j <= end; j++) {
                        System.out.print(message.charAt(j));
                    }
                    System.out.print(" ");
                    start = end = i - 1;
                }
            }
            if (start == end) {
                start = 0;
                for (int i = start; i <= end; i++) {
                    System.out.print(message.charAt(i));
                }
                System.out.println();
            }
        }
    }
}