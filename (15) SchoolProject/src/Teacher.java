public class Teacher {
    /*
    The Teacher class is where data about the teachers is stored. It contains the first, last, and full names of teachers,
    the subject each teacher teaches, the toString method to print the name and subject of each teacher, and the Teacher
    constructor with parameters to create new teachers. This class is also used to create the teachers array list in the School class.
    */

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

    public String toString(){           //toString method prints the name and subject taught by the teacher
        return "Name: " + getName() + " Subject: " + subject;
    }

    Teacher(String fName, String lName, String subject){   //Teacher constructor creates new teachers with a first and last name and a subject
        this.fName = fName;
        this.lName = lName;
        this.subject = subject;
    }
}
