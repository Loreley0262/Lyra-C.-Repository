public class Test {

    /*
    fields
     */
    private String color;
    private int id;
    public int currentSpeed;
    public String name;
    // public is accessor (default so no accessor is public too)
    //make private unless its gon change

    //constructors = method but method name=class name, only runs when you instantiate a new obj
    // - is private, + is public
    // 1st is class name, 2nd is field, 3rd is method

    Test(String color, int id, int currentSpeed, String name){
        this.color = color;
        this.id = id;
        this.currentSpeed = currentSpeed;
        this.name = name;
    }


    //methods
    public void setColor(String color){     //setter changes thingo in field
        //bc private, needs public method to access
        this.color = color;
        //this is instance of object we're working in
    }

    public String getColor(){     //getter gets thingo in field
        return color;
    }

    public void setCurrentSpeed(int speed){
        if (speed<0){
            speed=0;
        }
        this.currentSpeed = speed;
    }

    public String toString(){
        return "make" + name + "id" +id + "speed"+ currentSpeed;
    }

}
