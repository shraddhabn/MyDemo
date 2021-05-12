package Collection;

import java.util.Enumeration;
import java.util.Hashtable;

public class demo {

	public static void main(String[] args) {
		
		Hashtable<String,String> hs = new Hashtable<String,String>();
		hs.put("Andra Pradesh", "Amaravati");
		hs.put("Maharashatra", "Mumbai");
		hs.put("Telangana", "Hyderabad");
		hs.put("Nagaland", "Kohima");
		
		Enumeration<String> keys = hs.keys();
		while(keys.hasMoreElements()) {
			String k = (String)keys.nextElement();
			
			String v = hs.get(k);
			System.out.println(k + " - " +  v);
		}
	}

}
