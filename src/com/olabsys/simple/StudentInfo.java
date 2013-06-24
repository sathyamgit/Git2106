package com.olabsys.simple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StudentInfo {

	

	

	/**
	 * @param args
	 * @param Student 
	 */
	public static void main(String[] args) {
		
		/*ArrayList al=new ArrayList();
		al.add(new Student(1,"sbc","xyz"));
		al.add(new Student(2,"def","efg"));
		
		Collections.sort(al,new NameCompartorStudent());
		
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			Student s=(Student) it.next();
			System.out.println(s.no+" "+s.name+" "+s.course);
		}
		
		
	}*/
		/*ArrayList al=new ArrayList();
		al.add(new Student(1,"abc","ssc"));
		al.add(new Student(3,"cde","mpc"));
		
		ArrayList al2 = new ArrayList();
		al2.add(new Address("hyd","ap","india"));
		//Collections.sort(al);
		
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			Student s=(Student) it.next();
			System.out.println(s.no+" "+s.name+" "+s.course);
			
		}
		//System.out.println(s.no+" "+s.name+" "+s.course);
		Iterator it2=al2.iterator();
		while(it2.hasNext())
		{
			Address a=(Address) it2.next();
			System.out.println(a.city+" "+a.state+" "+a.country);
		}
		
		
		
		
	}
*/
		
		
		ArrayList al=new ArrayList();
		al.add(new Student(1,"abc","ssc"));
		al.add(new Student(3,"cde","mpc"));
		
		ArrayList al2 = new ArrayList();
		al2.add(new Address("hyd","ap","india"));
		al.addAll(al2);
				//Collections.sort(al);
		
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			
			Student s=(Student) it.next();
			
			Address a=(Address)it.next();
			if( s instanceof(Student))
			{
				
			}
			else (a instanceof(Address))
			{
				
			}
			
			
			
			System.out.println(s.no+" "+s.name+" "+s.course+" "+a.city+" "+a.state+" "+a.country);
			
		}
		
		
		
		
		
	}

}
