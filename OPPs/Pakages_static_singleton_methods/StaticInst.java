package OPPs.Pakages_static_singleton_methods;


// this is a demo to show initialization of static variable

public class StaticInst {
    static int a = 4;
    static int b;

    // static block
    static{
        System.out.println("I am in static block");
        b=a*5;
    }

    public static void main(String[] args) {
        StaticInst obj  = new StaticInst();
        System.out.println(StaticInst.a +" "+StaticInst.b);

        StaticInst.b +=3;
        
        System.out.println(StaticInst.a + " " + StaticInst.b);

        StaticInst obj2  = new StaticInst();
        System.out.println(StaticInst.a + " " + StaticInst.b);

        // static block run only once when any object is created

    }

    
}