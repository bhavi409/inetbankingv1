package listeners;

import java.util.HashMap;
import java.util.Map;

public class Hashmapdemo {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(101, "Jim");
		hm.put(101, "Jim");
		hm.put(102, "Jim");
		hm.put(103, "bhavi");
		hm.put(104, "rishi");
		hm.put(105, "ani");
		
		System.out.println(hm);
		
		hm.remove(101);
		System.out.println(hm);
		
		
		for(Map.Entry m : hm.entrySet())
			
		{
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
	}

}
