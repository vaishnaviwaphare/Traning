import com.mmcoe.stock.Broker;
import com.mmcoe.stock.Exchange;
import com.mmcoe.stock.Holder;
import com.mmcoe.stock.StockSingleton;

public class TestStock {

	public static void main(String[] args) {
//		Stock tisco = new Stock();
		
		Holder h = StockSingleton.getStock();
		h.viewQuote();
		
		Broker b = StockSingleton.getStock();
		b.getQuote();
		
		Exchange x = StockSingleton.getStock();
		x.setQuote();
		
		System.out.println(h == b);
		System.out.println(b == x);
	}
}
