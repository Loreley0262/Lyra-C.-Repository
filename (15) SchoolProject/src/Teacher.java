public class Teacher {

    public String getlName() {
        return lName;
    }
    public void setlName(String lName) {
        this.lName = lName;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getfName() {
        return fName;
    }
    public void setfName(String fName) {
        this.fName = fName;
    }
    public String getName() {
        return getfName() + " " + getlName();
    }
    public void setName(String name) {
        this.name = name;
    }

    String fName;
    String lName;
    String name;
    String subject;

    public String toString(){
        return "Name: " + getName() + " Subject: " + subject;
    }

    Teacher(String fName, String lName, String subject){
        this.fName = fName;
        this.lName = lName;
        this.subject = subject;
    }
}
