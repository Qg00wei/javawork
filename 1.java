import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s;
        s = sc.next();

        try {
            s = new BigInteger(s,16).toString();
            System.out.println(s);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}