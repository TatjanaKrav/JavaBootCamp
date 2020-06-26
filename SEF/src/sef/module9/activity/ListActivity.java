package sef.module9.activity;
//Needs to be completed

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListActivity {

	public static void main(String[] args) {
		//1 - Type code to create a list of names. Use ArrayList.
		List names = new ArrayList();
		
		names.add("Tanja");
		names.add("Andrej");
		names.add("Darja");
		names.add("Michail");
		names.add("Valja");
		//2 - Call print method to print the list passed as its parameter.
		ListActivity obj = new ListActivity();
		obj.print(names);
	}
	
	void print(List list)
	{
		//3 - Type code to print this list
		//Notice the order in which elements get printed.
		Iterator i = list.iterator();
		while(i.hasNext()) {
		System.out.println(i.next());
	}
}}
