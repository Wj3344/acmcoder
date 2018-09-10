import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int sum = 0;
        int max = 0;
        for (int i = 0; i < N; i++)
        {
            int up, down;
            down = scanner.nextInt();
            up = scanner.nextInt();
            sum = sum + up;
            sum = sum - down;
            max = sum > max ? sum : max;
        }
        System.out.println(max);
    }
}