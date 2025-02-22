import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int resultMax = max(x, y, z);
        //System.out.println(result);
        ShowResult(resultMax);

        sc.close();

    }

    public  static  int max(int a, int b, int c){

        if (a > b && a > c){
            return a;
        }else if ( b > c){
            return b;
        }else {
            return c;
        }
    }

    public static void ShowResult(int value){
        System.out.println("Higher = " + value);
    }
}
