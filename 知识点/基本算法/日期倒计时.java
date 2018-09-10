import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = simpleDateFormat.parse(message);
            Date now = simpleDateFormat.parse("2015-10-18");
            long day = Math.abs(date.getTime() - now.getTime());//得到的两个日期的毫秒数大小
            day = (long) (day / (1000 * 60 * 60 * 24));
            System.out.println(day);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
