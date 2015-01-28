package factory2;

public class ManagementFactory {

	/**
	 *  Nếu lương trên 5000$ thì sẽ được gửi tại ngân hàng
	 *  Nếu lương trên 1000$ và nhỏ hơn 5000&
	 *  thì sẽ được gửi thẻ ATM
	 *  Nếu lương nhỏ hơn 1000$ thì sẽ được thanh toán 
	 *  bằng tiền mặt
	 */
	public static MoneyManagement getInstance(float salary) {
		
		if (salary < 1000) {
			return new Wallet("Wallet");
		} else if (salary < 5000) {
			return new ATM("ATM");
		} else
			return new Bank("Bank");
	}
}
