package Problems.Splitwise;

import Problems.Splitwise.entities.User;

public class Main {
    public static void main(String[] args) {
        Splitwise splitwise = Splitwise.getInstance();

        User alice = new User("Alice", "alice@a.com");
        User bob = new User("Bob", "bob@b.com");
        User charlie = new User("Charlie", "charlie@c.com");
        User david = new User("David", "david@d.com");


    }
}
