public class MethodNotes {
//---------------------------------------------------bisection algorithm!!!---------------------------------------------------
    public static void printline(){ // the void means no return
        System.out.println("start");
        System.out.println("fini");
    }

    public static int printone(){ // this returns the int one
        return 1;
    }

    public static double sqrt(double num){
        double answer = 0.0;
        double increment=0.001;
        double epsilon=0.01;
        while (Math.abs(answer*answer - num) > epsilon){
            answer+=increment;
        }
        return answer;
    }


    public static void main(String[] args) {
        System.out.println(sqrt(27));
        System.out.println(Math.pow(3,2));
        //sout is a method b/c needs parameters (ends with ())
        //sout, Math.pow, must be invoked(called) to be used
        //static methods!!
        printline(); // I called the printline method here so it runs main till printline then continues main after printline
        System.out.println("after method");
        System.out.println(printone()*8);
        //hypotenuse(); --------------------fix it----------

    }
}
