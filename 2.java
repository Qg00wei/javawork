import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Date date = new Date();
        String datestr = sc.next();
        String format = "yyyy-MM-dd";
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
            date = simpleDateFormat.parse(datestr);

        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println(date);
    }
}