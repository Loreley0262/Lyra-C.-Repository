import java.util.ArrayList;

public class Student {

    private static int iden;
    private String name;


    public int getIden() {
        return iden;
    }
    public String getName() {
        return name;
    }



    public String toString(){
        return "Name: " + getName() + "\nID: " + getIden();
    }

    Student(String firstName, int id){
        iden = id;
        this.name = firstName;

    }


}
