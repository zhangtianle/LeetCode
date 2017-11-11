package codingInterviews;


/**
 * Created by Kyle on 2017/11/7.
 */
public class Singleton {
    private Singleton() {

    }

    private volatile static Singleton singleton = null;

    public Singleton getSingleton() {
        if (singleton == null) {
            synchronized(Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

}
