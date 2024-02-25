package lab2;

import java.util.ArrayList;
import java.util.List;

public class Model {
    List<User> users = new ArrayList<>();
    public void saveUser(String firstName, String lastName){
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        users.add(user);
    }
    public List<User> getAllUsers (){
        return users;
    }
}
