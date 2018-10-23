import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String line1 = scanner.nextLine();
            String[] array = line1.split(" ");
            int N = Integer.parseInt(array[0]);
            int M = Integer.parseInt(array[1]);
            HashSet<Integer> hashSet = new HashSet<>();
            String line2 = scanner.nextLine();
            String line3 = scanner.nextLine();
            array = line2.split(" ");
            for (int i = 0; i < array.length; i++) {
                hashSet.add(Integer.parseInt(array[i]));
            }
            array = line3.split(" ");
            for (int i = 0; i < array.length; i++) {
                hashSet.add(Integer.parseInt(array[i]));
            }
            Iterator<Integer> iterator = hashSet.iterator();
            int[] t = new int[hashSet.size()];
            int index = 0;
            while (iterator.hasNext()) {
                t[index++] = iterator.next();
            }
            Arrays.sort(t);
            for (int i = 0; i < t.length; i++) {
                System.out.print(t[i] + " ");
            }
            System.out.println();
        }
    }
}