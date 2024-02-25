package lab2;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class GuiView extends JFrame{
    private JTextField firstNameTextField;
    private JPanel userPanel;
    private JTextField lastNameTextField;
    private JButton saveButton;
    private JPanel rootPanel;
    private JPanel labelPanel;
    private JPanel textFieldPanel;
    private JPanel buttonPanel;
    private JLabel firstNameLabel;
    private JLabel lastNameLabel;
    private JPanel tablePanel;
    private JScrollPane tablePane;
    private JTable userTable;

    public GuiView() throws HeadlessException {
        setContentPane(rootPanel);
        setTitle("MyApp");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,600);
        setLocationRelativeTo(null);
        setVisible(true);
        createTable();
    }

    private void createTable() {
        userTable.setModel(new DefaultTableModel(
                null,
                new String[]{"First name", "Last name"}
        ));
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
