import com.mmcoe.bank.Accounts;
import com.mmcoe.bank.BalanceException;

public class TestAccounts {

	public static void main(String[] args) {
		Accounts ac = new Accounts(5000);
		System.out.println(ac);	// Bal: 5000 OD: 10000
		
		try {
			ac.withdraw(50000);
		} catch (BalanceException e) {
//			e.printStackTrace();	// Developers -> Troubleshooting
//			System.out.println(e);	// Logging -> Audit System behaviour
			System.out.println(e.getMessage());	// End user
		}
		
//		ac.withdraw(3000);
//		System.out.println(ac);	// Bal: 2000 OD: 10000
//		ac.withdraw(7000);
//		System.out.println(ac);	// Bal: 0 OD: 5000
//		
//		ac.deposit(2000);
//		System.out.println(ac);	// Bal: 0 OD: 7000
//		ac.deposit(5000);
//		System.out.println(ac);	// Bal: 2000 OD: 10000
	}
}
