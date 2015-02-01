package flyweight1;

/**
 * Lớp ConcreteCharacter được dùng để thực thi
 * Interface Characterr
 *
 */
public class ConcreteCharacter implements Characterr {
	private String symbol;
	private String font;

	public ConcreteCharacter(String symbol, String font) {
		super();
		this.symbol = symbol;
		this.font = font;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Symbol " + this.symbol + " with font " + this.font);
	}

}
