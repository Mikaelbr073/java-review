package entities;

public class Emplyoee {

    private int id;
    private String name;
    private double salary;

    public Emplyoee (int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void updateSalary(double percentage){
     salary += ((percentage/100) * salary);
    }

    @Override
    public String toString() {
        return "id: " + id + ",name: " + name + ",salary: " + salary;
    }
}
