package reviews;
// When defining package, EXCLUDE THE MODULE DIRECTORY.

public class SingletonReview {
    private static volatile SingletonReview instance;
    String data;

    private SingletonReview(String data) {
        this.data = data;
    }

    public static SingletonReview getInstance(String data) {
        SingletonReview result = instance;
        if (result == null) {
            synchronized (SingletonReview.class) {
                result = instance;
                if (result == null) {
                    instance = result = new SingletonReview(data);
                }
            }
        }
        return result;
    }
}