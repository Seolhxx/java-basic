package access.ex;

public class Item {
    private String product;
    private int price;
    private int quantity;

    public void addItem(String product, int price, int quantity) {
    }

    public void displayItems(String product, int price, int quantity) {
        int sum = 0;
        sum = price * quantity;
        System.out.println("상품명:" + product + "합계:" + sum);
    }
}
