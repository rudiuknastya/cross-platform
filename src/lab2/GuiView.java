package lab2;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class GuiView{
    private JFrame win;
    private JTextField firstNameTextField;
    private JTextField lastNameTextField;
    private JButton saveButton;
    private JLabel firstNameLabel;
    private JLabel lastNameLabel;
    private JTable userTable;

    public GuiView() throws HeadlessException {
        win = new JFrame();
        win.setTitle("MyApp");
        win.setSize(800, 600);
        win.setDefaultCloseOperation(EXIT_ON_CLOSE);

        initializeFirstNameLabel();
        initializeFirstNameTextField();
        initializeLastNameLabel();
        initializeLastNameTextField();
        initializeButton();
        createTable();

        
        win.setLocationRelativeTo(null);
        win.setLayout(null);
        win.setVisible(true);
    }


    private void initializeFirstNameLabel(){
        firstNameLabel = new JLabel("First name", JLabel.LEFT);
        firstNameLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        firstNameLabel.setSize(100, 20);
        firstNameLabel.setLocation(100, 200);
        win.add(firstNameLabel);
    }
    private void initializeFirstNameTextField() {
        firstNameTextField = new JTextField();
        firstNameTextField.setFont(new Font("Arial", Font.PLAIN, 15));
        firstNameTextField.setSize(190, 20);
        firstNameTextField.setLocation(200, 200);
        win.add(firstNameTextField);
    }
    private void initializeLastNameLabel() {
        lastNameLabel = new JLabel("Last name");
        lastNameLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        lastNameLabel.setSize(100, 20);
        lastNameLabel.setLocation(100, 250);
        win.add(lastNameLabel);

    }
    private void initializeLastNameTextField() {
        lastNameTextField = new JTextField();
        lastNameTextField.setFont(new Font("Arial", Font.PLAIN, 15));
        lastNameTextField.setSize(190, 20);
        lastNameTextField.setLocation(200, 250);
        win.add(lastNameTextField);
    }
    private void initializeButton() {
        saveButton = new JButton("Save");
        saveButton.setFont(new Font("Arial", Font.PLAIN, 15));
        saveButton.setSize(100, 20);
        saveButton.setLocation(150, 300);
        saveButton.setVisible(true);
        win.add(saveButton);
    }

    private void createTable() {
        userTable = new JTable();
        userTable.setModel(new DefaultTableModel(
                null,
                new String[]{"First name", "Last name"}
        ));
        JScrollPane sp = new JScrollPane(userTable);
        sp.setLocation(450, 75);
        sp.setSize(300, 400);
        win.add(sp);
    }

    public JTextField getFirstNameTextField() {
        return firstNameTextField;
    }

    public JTextField getLastNameTextField() {
        return lastNameTextField;
    }

    public JButton getSaveButton() {
        return saveButton;
    }

    public JTable getUserTable() {
        return userTable;
    }


}
