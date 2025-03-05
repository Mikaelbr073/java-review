package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // Consumir a nova linha pendente após o nextInt()

        Product[] vect = new Product[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite o nome do produto: ");
            String name = sc.nextLine();
            System.out.print("Digite o preço do produto: ");
            double price = sc.nextDouble();
            sc.nextLine();
            vect[i] = new Product(price, name); // A ordem dos parâmetros deve ser (name, price)
        }

        double sum = 0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();
        }

        double avg = sum / n;

        System.out.printf("AVG: %.2f%n", avg);

        sc.close();
    }
}