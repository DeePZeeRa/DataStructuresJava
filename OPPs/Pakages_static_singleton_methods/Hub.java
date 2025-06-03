package OPPs.Pakages_static_singleton_methods;

public class Hub {
    // The JVM can run it without creating an object of the class.
    public static void main(String[] args) {
        // here we are creating a new object where we want to understand the concept of static
        Human Rahul = new Human(22, "Rahul Gupta", 30000, false);
        System.out.println(Rahul.population);// prints 1  ( not preferred way to get population)

        //creating new object 

        Human Amy = new Human(25, "Amy Gupta", 110000, true);
        // classname.staticVariable ,,,, not objectName.staticVariable
        System.out.println(Human.population);  // prints 2
        // static variables depends on class, not on objects 
        // so there is no particular static value which is just assigned to respective object


        //! Why we write public static void main(String[] args)?
        //?-->  

    }
    static void population(int arr){
        
    }
    
}
