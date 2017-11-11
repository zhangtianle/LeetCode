package codingInterviews;

/**
 * Created by Kyle on 2017/11/7.
 */
public class Singleton2 {
    private Singleton2() {
    }

    private static class Hoder {
        private static Singleton2 singleton = new Singleton2();
    }

    public Singleton2 getSingleton2() {
        return Hoder.singleton;
    }
}
