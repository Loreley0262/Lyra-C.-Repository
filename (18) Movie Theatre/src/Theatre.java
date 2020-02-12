public class Theatre {
    private IntegerSet seatsRemaining;
    private IntegerSet occupiedSeats;
    private IntegerSet aisleSeats;
    private int totalRows;

    //---------------------CUSTOM THEATRE---------------------
    Theatre(int totalSeats, int[] firstRowAisleSeats, int rows){
        seatsRemaining = new IntegerSet();
        occupiedSeats = new IntegerSet();
        aisleSeats = new IntegerSet();
        for (int i = 0; i<totalSeats; i++){
            seatsRemaining.insert(i+1);
        }
        for (Integer n : firstRowAisleSeats){       //for each loop = "n" becomes every int in firstRowAisleSeats (for loop but not)
            aisleSeats.insert(n);
        }
        totalRows = rows;

    }
    //---------------------DEFAULT THEATRE---------------------
    Theatre(){
        seatsRemaining = new IntegerSet();
        occupiedSeats = new IntegerSet();
        aisleSeats = new IntegerSet();
        for (int i = 0; i<120; i++){
            seatsRemaining.insert(i+1);
        }
        totalRows = 10;
    }


    //Requires: integer, seat num
    //Modifies: this (the intsets)
    //Effects: if seat is in remaining intset put it into occupied intset, else do nothing
    public void purchaseSeat(Integer seatNum){

    }

    //Effects: returns seats remaining in theatre
    public IntegerSet getSeatsRemaining(){
        return seatsRemaining;
    }

    //Requires: Integer, seat num
    //Effects: ret true if seat on aisle, else ret false
    public boolean isAisle(Integer seatNum){
        return false;
    }

    //Requires: Integer, seat num
    //Effect: ret true if seat has been purchased, else ret false
    public boolean isPurchased(Integer seatNum){
        return false;
    }

    //Effects: ret num of remaining seats
    public int getSize(){
        return 42;
    }
}


test.isPurchased(2);
        test.getSize();