public class Circle {

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
    public double getCircumference(){
        return 2*Math.PI*radius;
    }
    public String toString(){
        return "Circle[radius = " + radius + "]";
    }
    private double radius;

    Circle(){
        this.radius = 1;
    }



}

//area of a circle = pi*r^2
//circumference = 2*PI*r