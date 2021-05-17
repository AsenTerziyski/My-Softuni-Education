package commandDesignPattern;

public class HeatingOnCommand implements ICommand {
    @Override
    public void execute() {
        String on = this.getClass().getSimpleName().substring(7,9).toUpperCase();
        System.out.println("You turned the heater " + on + "!");
    }
}
