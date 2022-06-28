package models;

import db.UsersMock;
import java.util.ArrayList;

public class Auth {
    private String email;
    private String password;

    public Auth() {}

    public Auth(String email, String password) {
        this.email = email;
        this.password = password;
    }
    
    public boolean chackValidLogin(User user) {
        if(user.getEmail().equals(this.getEmail()) && 
           user.getPassword().equals(this.getPassword())
        ) {
            return true;
        }
        return false;
    }
    
    public boolean login() {
        boolean loginValid = false;
        
        for(User user: UsersMock.data){
            if(this.chackValidLogin(user)){
                loginValid = true;
                break;
            }
        }
        return loginValid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
