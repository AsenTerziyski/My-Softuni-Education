package BasketOfDemoItems;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        DemoItem demoItem1 = new DemoItem("Brand 1");
        DemoItem demoItem2 = new DemoItem("Brand 2");
        DemoItem demoItem3 = new DemoItem("Brand 3");
        DemoItem demoItem4 = new DemoItem("Brand 3");
        DemoItem demoItem5 = new DemoItem("Brand 3");
        DemoItem demoItem6 = new DemoItem("Brand 3");
        DemoItem demoItem7 = new DemoItem("Brand 3");
        System.out.println(demoItem1.getID());
        System.out.println(demoItem2.getID());
        System.out.println(demoItem3.getID());
        System.out.println(demoItem4.getID());
        System.out.println(demoItem5.getID());
        System.out.println(demoItem6.getID());
        System.out.println(demoItem4.getID());
        System.out.println();
        System.out.println();
        CollectionOfDemos collectionOfDemos = new CollectionOfDemos();
        collectionOfDemos.addItemInTheBasket(demoItem1);
        System.out.println(collectionOfDemos.getBasketItemCount());
        collectionOfDemos.addItemInTheBasket(demoItem2);
        System.out.println(collectionOfDemos.getBasketItemCount());
        collectionOfDemos.addItemInTheBasket(demoItem3);
        System.out.println(collectionOfDemos.getBasketItemCount());
        collectionOfDemos.addItemInTheBasket(demoItem4);
        System.out.println(collectionOfDemos.getBasketItemCount());
        collectionOfDemos.addItemInTheBasket(demoItem4);
        System.out.println(collectionOfDemos.getBasketItemCount());
        collectionOfDemos.addItemInTheBasket(demoItem4);
        System.out.println(collectionOfDemos.getBasketItemCount());
        collectionOfDemos.addItemInTheBasket(demoItem4);
        System.out.println(collectionOfDemos.getBasketItemCount());
        collectionOfDemos.addItemInTheBasket(demoItem4);
        System.out.println(collectionOfDemos.getBasketItemCount());
        System.out.println();
        System.out.println(collectionOfDemos.getBasket().size());
        System.out.println();
        collectionOfDemos.getBasket().stream().forEach(System.out::println);


    }
}
