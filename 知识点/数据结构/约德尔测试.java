import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        line1 = line1.toLowerCase();
        int sum = 0;
        for (int i = 0; i < line1.length(); i++) {
            char c = ((line1.charAt(i) >= 'a' && line1.charAt(i) <= 'z') || (line1.charAt(i) >= '0' && line1.charAt(i) <= '9')) ? '1' : '0';
            if (c == line2.charAt(i)) {
                sum++;
            }
        }
        System.out.printf("%.2f", sum / (line1.length() * 0.01));
        System.out.println("%");
    }
}