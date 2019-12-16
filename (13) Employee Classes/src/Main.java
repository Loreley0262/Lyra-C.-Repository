public class Main {

    public static void main(String[] args) {
        Employee john = new Employee(10, "John", "Doe", 100);

        System.out.println("id = "+john.id);
        System.out.println("name = "+john.name());
        System.out.println("monthly salary w/o raise = "+john.salary);
        System.out.println("annual salary w/o raise = "+john.annualSalary());
        john.raise();  //changes salary to include raise
        System.out.println("monthly salary w/raise = "+john.salary);
        System.out.println("annual salary w/raise = "+john.annualSalary());
        System.out.println(john.toString());  //the tostring part


    }
}
