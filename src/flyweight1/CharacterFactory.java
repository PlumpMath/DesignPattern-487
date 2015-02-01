package flyweight1;

import java.util.Hashtable;

public class CharacterFactory {

	private Hashtable<String, Characterr> pool = new Hashtable<String, Characterr>();

	public int getNum() {
		return pool.size();
	}

	public Characterr get(String symbol, String fontFace) {
		Characterr c;
		String key = symbol + fontFace;
		if ((c = (Characterr) pool.get(key)) != null) {
			return c;
		} else {
			c = new ConcreteCharacter(symbol, fontFace);
			pool.put(key, c);
			return c;
		}

	}

}
