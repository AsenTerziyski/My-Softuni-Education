package BasketOfDemoItems;

public class DemoItem {
    private String brand;
    private static int ID = 0;
    private String IDofItem;

    public DemoItem(String brand) {
        this.brand = brand;
        this.setIDofItem();
    }

    private void setIDofItem() {
        this.IDofItem = String.format("ID%d", getID());
    }


    public int getID() {
        return ID += 1;
    }

    @Override
    public String toString() {
        return "Demo item with " + this.IDofItem + ", brand: " + this.brand;
    }
}
