package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class JavaStack {

	public static List synchronizedList(List l){
		return l;}

	public static void main(String[] args) {

		
		
		/*
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("A", "abc");
		map.put("B", "abcd");
		map.put("C", "abce");
		
		Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();
		
		while(itr.hasNext())
		{
			
			Map.Entry<String, String> mp = itr.next();
			System.out.print(mp.getKey()+" :");
			System.out.println(mp.getValue());
		}*/
		
		
		 String removeElem = "Perl";
	        List<String> myList = new ArrayList<String>();
	        myList.add("Java");
	        myList.add("Unix");
	        myList.add("Oracle");
	        myList.add("C++");
	        myList.add("Perl");
	        System.out.println("Before remove:");
	        System.out.println(myList);
		
		
		
		Iterator<String> itr = myList.iterator();
		while(itr.hasNext())
		{
			if(removeElem.equals(itr.next()))
			{
				itr.remove();
			}
		}
		
		System.out.println(myList);
		
		
		ListIterator<String> litr = myList.listIterator();
		
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		



		/*et<String> set = new HashSet<String>(list);

		List<String> lst = Collections.unmodifiableList(list);
		//lst.add("sfsf");
		System.out.println(set);
		 */

		/*Stack sc = new Stack();
		sc.add("rajesh1");
		sc.add("rajesh2");
		sc.add("rajesh3");
		sc.add("rajesh4");
		sc.add("rajesh5");


		sc.push(sc.get(2));

		Enumeration rm = sc.elements();

		while(rm.hasMoreElements())
		{
			System.out.println(rm.nextElement());
		}*/

		/*String str = "abccbac";
		String pallindrome = "";
		Stack<Character> ch = new Stack<Character>();

		for(int i=0;i<str.length();i++)
		{
			char c = str.charAt(i);
			ch.push(c);
		}
		while(!ch.empty())
		{
			pallindrome = pallindrome+ch.pop();
		}*/

		/*Queue<String> pr = new PriorityQueue<String>();
		 pr.po*/


	}

}
