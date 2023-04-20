package reviews;

public class SingletonReview {

    private static volatile SingletonReview instance;
    private String data;

    private SingletonReview(String data) {
        this.data = data;
    }

    private SingletonReview getInstance(String data) {
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
