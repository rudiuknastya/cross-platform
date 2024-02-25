package lab2;

import java.util.Scanner;

public class CliView {
    Scanner scanner = new Scanner(System.in);
    public String getFirstName(){
        System.out.println("Enter first name: ");
        return scanner.nextLine();
    }

    public String getLastName(){
        System.out.println("Enter last name: ");
        return scanner.nextLine();
    }
    public void showUser(User user){
        System.out.println(user.getFirstName()+ "   " +user.getLastName());
    }
    public void showUserTitle(){
        System.out.println("Users:");
    }
}
