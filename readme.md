                               Singleton pattern 
Single Instance :
                  Singleton class having only one instance that share whole of the class 


Global Access:
                 It globally accesses so that other part of code access it where its need and use it 


Lazy initialization:
                  It initializes when initialization require it not created when class loaded 

Thread Safety :
                 Multiple thread can use only one instance multiple thread cannot be able to create
multiple objects.


Simple Example Of singleton class 

public class Singleton {
private static Singleton instance;

    // Private constructor to prevent external instantiation
    private Singleton() {
    }

    // Lazy initialization of the Singleton instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
