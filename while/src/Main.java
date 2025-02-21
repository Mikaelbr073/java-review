import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        int value = sc.nextInt();
        int amount = 0;

        while(value != 0){
            amount += value;
            value = sc.nextInt();

        }

        System.out.println(amount);
        sc.close();
    }
}