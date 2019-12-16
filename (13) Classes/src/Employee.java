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
        int annualSalary = salary*12;
        return annualSalary;
    }




    Employee(int id, String firstName, String lastName, int salary){
        id = 10;
        firstName = "John";
        lastName = "Doe";
        salary = 100;

    }

}
