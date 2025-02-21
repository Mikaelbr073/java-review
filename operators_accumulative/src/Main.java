import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("how minutes you use?");
        int minute = sc.nextInt();

        double account = 50.0;

        if(minute > 100){
          account += (minute - 100) * 2;
            System.out.println(account);
        }

        System.out.println(account);

        sc.close();
    }
}
