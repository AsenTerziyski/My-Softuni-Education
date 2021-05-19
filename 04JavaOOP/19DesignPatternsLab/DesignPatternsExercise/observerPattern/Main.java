package observerPattern;

public class Main {
    public static void main(String[] args) {

        ISubject site = new Subject();

        IObserver maria = new Observer();
        IObserver ivan = new Observer();
        IObserver peter = new Observer();

        site.registerObserver(maria);
        site.registerObserver(ivan);
        site.registerObserver(peter);



        site.changeState("NEW STATE!");

        site.removeObserver(maria);


    }
}
