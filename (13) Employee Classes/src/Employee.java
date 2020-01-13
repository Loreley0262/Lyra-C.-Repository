public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public int getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getName(){
        String fullName = firstName + " " + lastName;
        return fullName;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary(){
        return salary*12;
    }
    public void raiseSalary(){
        double raise = salary*0.05 + salary;
        salary = (int)raise;
    }

    Employee(int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }



    public String toString(){
        return "Employee[id = " + id + ", name = " + getName() + ", salary = " + salary + "]";
    }

}
