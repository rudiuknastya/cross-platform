package lab2;

import java.util.List;

public class CliController {
    private Model model;
    private CliView cliView;

    public CliController(Model model, CliView cliView) {
        this.model = model;
        this.cliView = cliView;
        runController();
    }
    private void runController(){
        while(true){
            String firstName = cliView.getFirstName();
            String lastName = cliView.getLastName();
            model.saveUser(firstName, lastName);
            List<User> users = model.getAllUsers();
            cliView.showUserTitle();
            for(User user: users){
                cliView.showUser(user);
            }
        }
    }
}
