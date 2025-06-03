package OPPs.Pakages_static_singleton_methods;

//! When to Use a Singleton
// When exactly one instance of a class is needed to manage shared resources or state.
// When global access to the instance is required without passing it explicitly.
// Examples include logging frameworks, configuration managers, or connection pools.

//! defination 
//Singleton pattern in Java is a design pattern that ensures a class has only one instance and provides a global point of access to that instance. This is particularly useful when a single, shared instance of a class is required to coordinate actions across a system, such as in logging, configuration management, or database connection pools

//! Use Cases of the Singleton Pattern
// Logging Framework
//Configuration Manager
// Database Pool connection
// Caching system 
// thread pool system
public class Singleton {
    

    private static Singleton instance;
    public static Singleton getInstance(){
        // check if one object is created or not
        if(instance == null){
            instance = new Singleton();
        }

        return instance;
    }
}
