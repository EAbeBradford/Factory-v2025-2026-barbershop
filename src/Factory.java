public class Factory { //barber shop

    //instace variables
    public int yearFounded;
    public boolean isOpen;
    public double earnings; //unit is in millions
    public String pruducts;

    public static void main(String[] args) {
        System.out.println("Welcome to Mx. Bradford's factory");

        new Factory();

    }

    //constructor
    public Factory(){
        System.out.println("we make houses!");
        yearFounded = 2025;
        isOpen = false;
        earnings = 1.1;
        pruducts = "houses";
        int x;
        factoryInfo();

        //change the value of the yearFounded and isOpen
        //call factoryInfo()

        //type varName = value;
        //object of type house
        House h1 = new House();
        h1.owner = "Mr. Kim";
        System.out.println("the owner is " +h1.owner);
        //todo: give all the house instance varibles values
        h1.address = "1790 cant ave milton mass";
        h1.isOccupied = true;
        h1.walls =10;
        h1.size = 200.21;


        House h2 = new House();

        System.out.println(h2.size);
        h2.size = 40.2;
        System.out.println(h2.size);
        h2.printInfo();

        //todo: make another house object called myHouse
        //call printInfo on myHouse
        House myHouse = new House();
        myHouse.printInfo();


        House customHouse = new House(200.24, 8, "Ms. Blair");
        customHouse.printInfo();

    }

    //todo: make a method called factoryInfo
    public void factoryInfo(){
        System.out.println("the facotry info: ");
        //todo: add souts to print the factory's instance variables
        System.out.println(pruducts);
        System.out.println("the year founded: ");
        System.out.println(yearFounded);
        System.out.println("the earnings " + earnings);
        System.out.println("it is " + isOpen + " that the factory is open");
    }

}
