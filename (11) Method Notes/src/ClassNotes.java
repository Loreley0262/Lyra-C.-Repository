public class ClassNotes {
    //this is the main file for classes
    public static void main(String[] args) {
        int num = 100;
        String word = "hello";
        //string is a class and data type
        Test toyota = new Test("blue", 1, 10, "corolla");
        System.out.println(toyota);   //location of thingo in memory
        Test honda = new Test("blue", 1, 10, "corolla");
        System.out.println(honda);    //location of thingo in memory
        //class is blueprint, instantiating it makes a new "instance" of a said class (car)
        toyota.name = "corolla";     // redundant bc constructor
        honda.name = "civic";        // redundant bc constructor
        System.out.println(toyota.name);
        System.out.println(honda.name);
        //toyota.id = 20;   //error b/c variable only accessed in host class
        toyota.setColor("blue");  //sets toyota color to "blue"
        System.out.println(toyota.getColor()); //prints out result
        System.out.println(toyota.toString());
    }
}
