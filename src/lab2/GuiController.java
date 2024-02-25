package lab2;

import javax.swing.table.DefaultTableModel;
import java.util.List;

public class GuiController {
    private Model model;
    private GuiView guiView;

    public GuiController(Model model, GuiView guiView) {
        this.model = model;
        this.guiView = guiView;
        initializeButton();
    }
    private void initializeButton(){
        guiView.getSaveButton().addActionListener(e -> saveUser());
    }
    private void saveUser(){
        String firstName = guiView.getFirstNameTextField().getText();
        String lastName = guiView.getLastNameTextField().getText();
        model.saveUser(firstName, lastName);
        emptyFields();
        List<User> users = model.getAllUsers();
        showUsersInTable(users);
    }

    private void emptyFields() {
        guiView.getFirstNameTextField().setText("");
        guiView.getLastNameTextField().setText("");
    }
    private void showUsersInTable(List<User> users) {
        DefaultTableModel tableModel = (DefaultTableModel) guiView.getUserTable().getModel();
        tableModel.setRowCount(0);
        for(User user: users){
            tableModel.addRow(new Object[]{
                    user.getFirstName(),
                    user.getLastName()
            });
        }
    }

}
