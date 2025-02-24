package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Enter Product data: ");
        System.out.println("Name: ");
        product.name = sc.nextLine();
        System.out.println("Price: ");
        product.price = sc.nextDouble();
        System.out.println("Quantity: ");
        product.quantity = sc.nextInt();
        System.out.println(product);
        System.out.println("enter the number of de products to be added in stock");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println("Updated: " + product);

        sc.close();
    }
}
