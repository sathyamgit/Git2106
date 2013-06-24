package com.olabsys.simple;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx1 {
	public static void main(String args[])
	{
		HashMap hm=new HashMap();
		hm.put(1,"ak");
		hm.put(3, "zk");
		hm.put(2,"kk");
		
		Set set=hm.entrySet();
		Collections.sort(set);
		Iterator it=set.iterator();
		while(it.hasNext())
		{
		Map.Entry m= (Map.Entry) it.next();
		System.out.println(m.getKey()+" "+m.getValue());
		
				}
		
		
		
	}

}
