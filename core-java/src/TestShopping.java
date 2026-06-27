import com.mmcoe.cart.CartFactory;
import com.mmcoe.cart.Product;
import com.mmcoe.cart.Shopping;
import com.mmcoe.cart.ShoppingCartException;

public class TestShopping {

	public static void main(String[] args) {
		Shopping cart = CartFactory.newCart();
		
		try {
			cart.addToCart(new Product("Marker", 25));
			cart.addToCart(new Product("Duster", 75));
			cart.addToCart(new Product("Pen", 20));
		} catch (ShoppingCartException e) {
			e.printStackTrace();
		}
		
		try {
			cart.checkout();
		} catch (ShoppingCartException e) {
			e.printStackTrace();
		}
	}
}
