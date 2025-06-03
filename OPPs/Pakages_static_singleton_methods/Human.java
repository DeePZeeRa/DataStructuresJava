package OPPs.Pakages_static_singleton_methods;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;  
    //? this is static variable which belongs to class itself, rather than to any specific instance (object) of the class

    public Human(int age,String name, int salary,boolean married){ // no need to send population as constructor as it is static
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }
}
