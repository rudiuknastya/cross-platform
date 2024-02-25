package lab2;

import java.util.Scanner;

public class App {
    public static void launch(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter g if you want GUI or c if CLI:");
        String choice = scanner.nextLine();
        Model model = new Model();
        if(choice.equals("g")){
            GuiController guiController = new GuiController(model, new GuiView());
        } else {
            CliController cliController = new CliController(model, new CliView());
        }
    }
}
