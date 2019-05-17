
import models.Auto;
import models.User;
import services.Userservice;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        System.out.println("Hello Java!");

        Userservice userService = new Userservice();
        User user = new User("Zangar", 21);
        userService.saveUser(user);
        Auto ferrari = new Auto("Ferrari", "red");
        ferrari.setUser(user);
        user.addAuto(ferrari);
        Auto ford = new Auto("Ford", "black");
        ford.setUser(user);
        user.addAuto(ford);
        user.setName("Zango");
        System.out.println(userService.findAllUsers());
        //userService.updateUser(user);
        //userService.deleteUser(user);
    }
}
