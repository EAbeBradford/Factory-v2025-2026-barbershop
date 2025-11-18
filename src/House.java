public class House {

    //intsacne vars
    //1. at the top of the class
    //2. they can be used anyware, but psvm
    //3. have the word public before
    public int walls;
    public double size;
    public String owner;
    public String address;
    public boolean isOccupied;

    //constucor
    //1. no void
    //2. same name as class
    //3. its a special method
    public House(){
        walls = 4;
        size = 3200.7;
        owner = "Bobby";
        address= "362 cemtre st.";
        isOccupied = true;
    }

    //hw: add 2 more parameters to the house construor, 1 for isOccupeid, 1 for address
    //set the instance varibale's value to the parameters
    //fix the related problems by adding them to the code in the factory Class

    public House(double pSize, int pWalls, String pOwner){
        size = pSize;
        walls = pWalls;
        owner = pOwner;
        //pSize = size;

    }

    //todo: make a printInfo() method that prints all the house instance vars
    public void printInfo(){
        System.out.println(walls); // not a readable way
        System.out.println(size); //not readable
        System.out.println("name of owner: " + owner); //readable
        System.out.println("address: " + address); //more simple readable
        System.out.println("It is " + isOccupied +" that the house is occupied."); //fancy readable
    }
}
