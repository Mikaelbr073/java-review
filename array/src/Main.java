import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vect = new double[n];

        for(int x = 0; x < n; x++){
          vect[x] = sc.nextDouble();

        }

        double sum = 0;
        for(int i = 0; i < n; i++ ){
            sum += vect[i];
        }

        System.out.println(sum);

        sc.close();
    }
}
