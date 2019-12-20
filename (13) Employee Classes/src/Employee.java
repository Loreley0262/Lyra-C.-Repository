public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    Employee(int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String name(){
        String fullName = firstName + " " + lastName;
        return fullName;
    }

    public int annualSalary(){
        return salary*12;
    }

    public void raise(){
        double raiseSalary = salary*0.05 + salary;
        salary = (int)raiseSalary;
    }

    public String toString(){
        return "Employee[id = " + id + ", name = " + name() + ", salary = " + salary + "]";
    }



}
