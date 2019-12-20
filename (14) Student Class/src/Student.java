public class Student {

    public static int getIdent() {
        return ident;
    }
    public static void setIdent(int ident) {
        Student.ident = ident;
    }

    static int ident;
    int beforeId;
    String name;

    public int getBeforeId() {
        return beforeId;
    }
    public void setBeforeId(int beforeId) {
        this.beforeId = beforeId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    Student(String firstName, int ident){
        this.beforeId = this.ident;
        this.name = firstName;
        this.beforeId++;
    }
}
