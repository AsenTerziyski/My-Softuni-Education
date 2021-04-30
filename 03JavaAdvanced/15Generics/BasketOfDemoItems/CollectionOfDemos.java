package BasketOfDemoItems;

import java.util.ArrayList;

public class CollectionOfDemos {
    private ArrayList<DemoItem> basket;
    private static int basketItemCount = 0;

    public CollectionOfDemos() {
        this.setBasket();
    }

    private void setBasket() {
        this.basket = new ArrayList<>();
    }

    public ArrayList<DemoItem> getBasket() {
        return this.basket;
    }

    public static int getBasketItemCount() {
        return basketItemCount;
    }

    public void addItemInTheBasket(DemoItem demoItem) {
        this.basket.add(demoItem);
        basketItemCount+=1;
    }

    public void removeItemFromTheBasket (int ID) {
        if (!this.basket.isEmpty()) {
            for (int i = 0; i <this.basket.size(); i++) {
                if (ID == this.basket.get(i).getID()) {
                    this.basket.remove(i);
                }
            }
        } else {
            throw new IllegalArgumentException("EMPTY BASKET");
        }

    }

}
