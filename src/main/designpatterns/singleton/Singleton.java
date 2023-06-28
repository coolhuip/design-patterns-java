package designpatterns.singleton;


/**
 * Concurrency-safe Singleton class.
 */
public class Singleton {

    // Throughout the entire program, there can only be ONE instance of Singleton per thread.
    //   -> ...b/c the VOLATILE keyword ensures correct instantiation of concurrent instances w/o corruption.
    private static volatile Singleton instance;
    private String data;

    /**
     * Used by Singleton.getInstance()
     * @param data String
     */
    private Singleton(String data) {
        this.data = data;
    }

    /**
     * Getter method: an instance of Singleton class.
     * @param data String
     * @return Singleton
     */
    public static Singleton getInstance(String data){
        // Because this.instance is VOLATILE, we should store the instance in a LOCAL VARIABLE 'result'
        //   -> This prevents direct access to memory.
        //     -> IMPROVES OVERALL PERFORMANCE BY 40% !!!
        Singleton result = instance;
        if (result == null) {   // limits synchronization to rare cases of constructing a new instance of this.instance
            synchronized (Singleton.class) {
                result = instance;
                if (result == null) {
                    instance = result = new Singleton(data);
                }
            }
        }
        return result;
    }

}
