package application;

import entities.Emplyoee;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Ler um número int N e depois os dados(id, nome e salario) de N funcionarios. Não deve ter id igual
        // depois enfetuar um aumento no salario de X%
        // Para isso ler o id eo valor x
        // depois mostrar todos os funcionarios

        ArrayList<Emplyoee> litEmplyoee = new ArrayList<>();

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("How many emplyoees will be register: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; ++i){
            System.out.printf("Emploee #%d%n", i + 1);
            System.out.print("id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();
            litEmplyoee.add(new Emplyoee(id, name, salary));
        }


        System.out.print("Enter de emplyoee id that have salary increase: ");
        int emplyoeeId = sc.nextInt();

        Emplyoee user = null;
        for(Emplyoee emp: litEmplyoee){
            if(emp.getId() == emplyoeeId){
                user = emp;
                break;
            }
        }
        if(user != null){
            System.out.print("Enter the porcentage: ");
            double porcentage = sc.nextDouble();
            user.updateSalary(porcentage);
        }else {
            System.out.println("Id not found.");
        }

        for (Emplyoee emp: litEmplyoee){
            System.out.println(emp);
        }

        //CLOSE SCANNER
        sc.close();




    }
}
