package elite;

import com.mmcoe.ds.LinkedList;

public class ShoppingCart {

    private LinkedList<Product> items;
    private double total;

    public ShoppingCart() {
        items = new LinkedList<Product>();
    }

    public void addToCart(Product p) throws ShoppingCartException {

        if (items.size() == 5) {
            throw new ShoppingCartException("Your cart is full");
        } else {
            items.add(p);
            total += p.getPrice();
        }
    }

    public void checkout() {

        items.print();

        System.out.println("Cart Total : " + total);
    }
}

class ShoppingCartException extends Exception {

    public ShoppingCartException(String message) {
        super(message);
    }
}