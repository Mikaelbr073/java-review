package application;

import entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Rent[] room = new Rent[10];

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++){
            System.out.println("Aluguel #" + (i + 1));
            String nome = sc.nextLine();
            String email = sc.nextLine();
            int numberRoom = sc.nextInt();
            sc.nextLine();
            room[numberRoom] = new Rent(nome, email, numberRoom);
        }

        for(int i = 0; i < room.length; i++){
            if(room[i] != null){
                System.out.println(room[i]);
            }
        }



        sc.close();
    }
}
