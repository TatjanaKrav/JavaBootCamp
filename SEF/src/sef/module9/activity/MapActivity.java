package sef.module9.activity;
//Needs to be completed

import java.util.*;


public class MapActivity {

		public static void main(String[] args) {
			//1 - Type code to create a HashMap of key value pair
			//where key is id of type String and value is a name
			Map map = new HashMap();
			map.put("1a", "Tanja");
			map.put("2b", "Darja");
			map.put("3c", "Andrej");
			map.put("4d", "Michail");
			//2 - Call print method to print the map passed as its parameter.
			
			new MapActivity().print(map);
		}
		
		void print(Map map)
		{
			//3 - Type code to print this map
			Set keySet = map.keySet();
			System.out.println("******************************");
			System.out.println("Key\tValue");
			Iterator it = keySet.iterator();
			while (it.hasNext())
			{
				String key = (String)it.next();
				System.out.println(key+"\t"+map.get(key));
			}
			System.out.println("******************************");
		}
	}
