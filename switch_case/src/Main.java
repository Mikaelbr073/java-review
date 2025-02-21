import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("What of teh week?");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String day;

      switch (x){

          case 1:
            day = "Monday";
            break;

          case 2:
              day = "tuesday";
              break;

          default:
              day = "Not found";
              break;
      }

      System.out.println(day);

      sc.close();






    }
}