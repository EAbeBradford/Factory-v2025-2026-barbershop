public class Factory {

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
