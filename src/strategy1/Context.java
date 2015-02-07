package strategy1;

public class Context {
	
	//
	private Strategy strategy;

	public Context() {
		// TODO Auto-generated constructor stub
		
		// xét thuật toán mặc định cho lớp khi gọi hàm khởi tạo
		setAlgorithmInterface(new ConcreateStrategyA());
	}

	public void setAlgorithmInterface(Strategy strategy) {
		
		// xét thuật toán 
		this.strategy = strategy;
	}

	// Thực hiện thuật toán
	public void doAction() {
		strategy.algorithmInterface();
	}

}
