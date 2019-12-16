public class Employee {
    int id;
    String firstName;
    String lastName;
    int salary;

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

    public int annualSalary(){
        return salary*12;
    }

    public String name(){
        String fullName = firstName + " " + lastName;
        return fullName;
    }

    public void raise(){
        double raisedSalary = salary*0.05 + salary;
        salary = (int)raisedSalary;
    }

    public String toString(){
        return "Employee[id = " + id + ", name = " + name() + ", salary = " + salary + "]";
    }

    Employee(int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

}
