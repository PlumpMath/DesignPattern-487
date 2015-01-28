package singleton2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
	
	public static void main(String[] args){
		ConsoleLogger console = ConsoleLogger.getConsoleLogger();
		
		Constructor<?> con = ConsoleLogger.class.getDeclaredConstructors()[0];
	    con.setAccessible(true);
	    try {
			ConsoleLogger p = (ConsoleLogger) con.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
