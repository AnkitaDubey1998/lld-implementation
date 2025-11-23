package Problems.Splitwise;

public class Splitwise {
    private static Splitwise instance;

    private Splitwise() {}

    public static synchronized Splitwise getInstance() {
        if(instance == null) {
            instance = new Splitwise();
        }
        return instance;
    }
}
