package db;

import java.util.ArrayList;
import models.User;

public class UsersMock {
    public static ArrayList<User> data = UsersMock.startDb();
    
    public static ArrayList<User> startDb(){
        System.out.println("oui");
        ArrayList<User> users = new ArrayList<User>();
        for(int count = 1; count <= 10; count++){
            User user = new User(
                "Fulano"+count+" da Silva",
                "fulano"+count+"@cai.com",
                "cai@1234"
            );
            users.add(user);
        }
        
        return users;
    }
}
