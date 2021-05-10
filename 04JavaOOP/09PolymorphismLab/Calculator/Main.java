package Calculator;

public class Main {
    public static void main(String[] args) {
        System.out.println(Casio.Divide(2, 1));
        System.out.println(Casio.Multiply(3,7));

        Casio casioCurrentInstance = new Casio();
        System.out.println(String.format("%.3f",casioCurrentInstance.Sum(10, 10)));
        System.out.println(casioCurrentInstance.Extract(10, 10));

    }
}
