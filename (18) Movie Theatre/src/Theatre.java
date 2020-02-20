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
        if (seatsRemaining.contains(seatNum)){
            occupiedSeats.insert(seatNum);
            seatsRemaining.remove(seatNum);
        }
    }

    //Effects: returns seats remaining in theatre
    public IntegerSet getSeatsRemaining(){
        return seatsRemaining;
    }

    //Requires: Integer, seat num
    //Effects: ret true if seat on aisle, else ret false
    public boolean isAisle(Integer seatNum){
        int seatsPerRow = getSize()/totalRows;
        return aisleSeats.contains(seatNum % seatsPerRow);

//        int seatnum = seatNum;
// return seatnum % 12 == 2 || seatnum % 12 == 3 || seatnum % 12 == 10 || seatnum % 12 == 11;  or use nums in firstRowAisleSeats to make shorter
        //prolly only works for this example b/c fixed values (2, 3, etc)
//        if (seatnum%12 == 2 || seatnum%12 == 3 || seatnum%12 == 10 || seatnum%12 == 11){/////you could use if statements, but this is faster b/c gives ans immediately
//            return true;
//        }
//        else{
//            return false;
//        }
    }

    //Requires: Integer, seat num
    //Effect: ret true if seat has been purchased, else ret false
    public boolean isPurchased(Integer seatNum){
        return occupiedSeats.contains(seatNum);   ///you could use if statements, but this is faster b/c gives ans immediately
    }

    //Effects: ret num of remaining seats
    public int getSize(){
        return seatsRemaining.size();
    }
}