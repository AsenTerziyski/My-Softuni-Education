package commandDesignPattern;

public class Main {
    public static void main(String[] args) {
        HeatingSystem heatingSystem = new HeatingSystem();

        ICommand heatOn = new HeatingOnCommand();
        ICommand heatOff = new HeatingOffCommand();
        //Controller controller = new Controller(heatOn);

        Controller controller = new Controller();
        controller.setCommand(heatOn);
        controller.executeCommand();

        controller.setCommand(heatOff);
        controller.executeCommand();

    }
}
