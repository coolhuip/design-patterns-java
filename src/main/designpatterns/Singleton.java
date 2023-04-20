package designpatterns;

public class Singleton {

    // Throughout the entire program, there can only be ONE instance of Singleton per thread.
    private static volatile Singleton instance;
    private String data;

    private Singleton(String data) {
        this.data = data;
    }

    public static Singleton getInstance(String data){
        // Because this.instance is VOLATILE, we should store the instance in a LOCAL VARIABLE 'result'
        //  -> This can improve the method's overall performance by 40% !!!
        //    -> ...b/c the VOLATILE keyword makes this.instance live in the main memory vs. cache.
        //          Therefore, the local variable lets us avoid accessing the main memory directly.
        Singleton result = instance;
        if (result == null) {   // blocks threads already w/ a Single instance ==> BETTER PERFORMANCE
            synchronized (Singleton.class) {   // concurrency
                if (instance == null) {
                    instance = new Singleton(data);
                }
            }
        }
        return instance;
    }

}


