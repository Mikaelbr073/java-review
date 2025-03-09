package entities;

public class Emplyoee {

    private String id;
    private String name;
    private double salary;

    public Emplyoee (String id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
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

    }
}
