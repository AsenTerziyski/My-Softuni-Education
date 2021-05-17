package commandDesignPattern;

public class HeatingOffCommand implements ICommand {
    @Override
    public void execute() {
        String off = this.getClass().getSimpleName().substring(7,10).toUpperCase();
        System.out.println("You turned the heater " + off +"!");
    }
}
