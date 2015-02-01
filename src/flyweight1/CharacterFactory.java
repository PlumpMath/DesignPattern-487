package flyweight1;

import java.util.Hashtable;

/**
 * @author Huy
 * Bản chất mẫu facade làm cho client tưởng mình đang làm việc 
 * với nhiều đối tượng cùng l lúc , nhưng chúng ta đã gộp tất cả các điểm 
 * giống nhau vào cùng 1 lớp để đại diện để thay thế cho các đối tượng 
 * tương đương  
 */
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
