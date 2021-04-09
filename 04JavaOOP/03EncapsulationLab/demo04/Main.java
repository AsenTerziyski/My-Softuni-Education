package demo04;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(200,500);
        Circle circle = new Circle(5);
        Map<String, Figure> figureDepository = new LinkedHashMap<>();
        figureDepository.put(rectangle.getClass().getSimpleName(), rectangle);
        figureDepository.put(circle.getClass().getSimpleName(), circle);
        for (String s : figureDepository.keySet()) {
            System.out.println(s.toString());
        }

        System.out.println(rectangle.getArea());
        System.out.println(circle.getArea());

        var collect = figureDepository.values().stream().filter(fd -> fd.getArea() > 100).collect(Collectors.toList());
        System.out.println(String.format("The bigger area is of the %s => %.2f",collect.get(0).getClass().getSimpleName(),collect.get(0).getArea()));

    }
}
