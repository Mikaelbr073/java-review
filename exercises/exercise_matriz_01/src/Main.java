import javax.sound.midi.Soundbank;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //line
        int m = sc.nextInt();
        //columns
        int n = sc.nextInt();

        int[][] matriz = new int[m][n];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter the number for find: ");
        int x = sc.nextInt();
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(matriz[i][j] == x){
                    System.out.println("Position: " + i + "," + j);
                    if(j > 0){
                        System.out.println("left: " + matriz[i][j-1]);
                    }

                    if(j < matriz[i].length - 1){
                        System.out.println("Right: " + matriz[i][j+1]);
                    }
                    if(i > 0){
                        System.out.println("up: " + matriz[i-1][j]);
                    }
                    if (i < matriz.length-1) {
                        System.out.println("Down: " + matriz[i+1][j]);
                    }
                }

            }

        }





        sc.close();
    }
}