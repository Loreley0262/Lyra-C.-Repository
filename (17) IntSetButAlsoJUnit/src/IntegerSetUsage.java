public class IntegerSetUsage {
/*
Making an Integer Set, class is set of as many nums and any nums
    only ints
    no duplicates

{3, 2, 6}   -> Y
{3, 2.5, 1} -> N (2.5 is bool, not int)
{3, 7, 3}   -> N (duplicates, there are two 3s)

What public methods will use?
    Insert
    Remove
What will methods do?
    Prerequisites for correctness (Requires clause)
    What does it change?          (Modifies clause)
    What does the method do?      (Effects clause)

 */

    public static void main(String[] args) {
        IntegerSet intset = new IntegerSet();
        System.out.println(intset.size());
        intset.insert(3);


    }
}
