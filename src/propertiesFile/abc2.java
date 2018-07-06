package propertiesFile;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class abc2 {
	public static void main(String arg[]) {
		Properties p = System.getProperties();
		Set set = p.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry m = (Map.Entry) itr.next();
			System.out.print(m.getKey()+" : "+m.getValue());
		}
	}
}
