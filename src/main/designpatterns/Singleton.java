package designpatterns;

public class Singleton {

    // Throughout the entire program, there can only be ONE instance of Singleton.
    private static Singleton instance;
    private String data;

    private Singleton(String data) {
        this.data = data;
    }
    private Singleton() {
    }

    public static Singleton getInstance(String data){
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton(data);
                }
            }
        }
        return instance;
    }

}


