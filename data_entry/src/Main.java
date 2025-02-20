import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // set local ex: Brazil
        Locale.setDefault(Locale.US);
        //Enter keyboard data, but you need to instantiate
        Scanner sc = new Scanner(System.in);

        //read data
        //sc.next read only one word, for read any words, use Sc.nextLine
        String name = sc.next();
        int year = sc.nextInt();
        double weight = sc.nextDouble();

        System.out.printf("%s you have %d years old and weight is %.2f%n", name, year, weight);
        sc.close();
    }
}
