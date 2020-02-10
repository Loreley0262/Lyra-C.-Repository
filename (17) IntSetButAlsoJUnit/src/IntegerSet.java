import java.util.ArrayList;

public class IntegerSet {
/*
    Prerequisites for correctness (Requires clause)
    What does it change?          (Modifies clause)
    What does the method do?      (Effects clause)
*/
//IntegerSet intsets = new IntegerSet();
    ArrayList<Integer> nums;

    IntegerSet(){
        nums = new ArrayList<>();
    }

    //Requires: int
    //Modifies: this
    //Effects:  inserts integer into set unless it's already there, in which do nothing
    public void insert(Integer num){
        if (!nums.contains(num)){
            nums.add(num);
        }
    }

    //Requires: int
    //Modifies: this
    //Effects:  remove if integer is in set, otherwise do nothing
    public void remove(Integer num){
        if (nums.contains(num)){
            nums.remove(num);
        }
    }

    //Requires: int
    //Modifies: this
    //Effects:  show size
    public int size(){
    return nums.size();
    }

    //Requires: int
    //Modifies: this
    //Effects:  see if it contains the num (TOrF)
    public boolean contains(Integer num){
    return nums.contains(num);
    }



        //TEMPORARY
    public void add(Integer num){
        nums.add(num);

    }

}
