package lab2;

public class Main {
    public static void main(String[] args) {
        GuiView guiView = new GuiView();
        Controller controller = new Controller(new Model(), guiView);
    }
}
