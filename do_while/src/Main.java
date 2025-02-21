import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        String step = "y";
         Scanner sc = new Scanner(System.in);
         do {
             System.out.print("type temp in celsius");
             double c = sc.nextDouble();
             double F = 9.0 * c / 5 + 32.0;
             System.out.printf("this your temp %.2f%n", F);
             System.out.print("Stop or no? ");
             step = sc.next();

         }while (step == "n");


         sc.close();
    }
}