package day7;
public class Car implements Vehicle,Register
{
   public String registration(){return ("It is registered at Irving,Dallas");}
    public String name(){return("It is BMW");}
    public static void main(String[] args) {
        /*Vehicle obj1 = new Car();      //method 1
        Register obj2 = new Car();
        String carName = obj1.name();
        String carRegistration = obj2.registration();
        System.out.println(carName );
        System.out.println(carRegistration);*/
        //method 2
        Car obj = new Car();
        String carName = obj.name();
        String carRegistration = obj.registration();
        System.out.println(carName );
        System.out.println(carRegistration);
              
    }
}
