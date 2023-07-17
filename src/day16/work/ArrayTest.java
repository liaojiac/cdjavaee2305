package day16.work;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayTest {
	public static void main(String[] args) {
		/*ArrayList<Contact> c = new ArrayList<>();
		Contact l1  =new Contact("杨欢", "9478795554");
		Contact l2  =new Contact("霍允", "8888895554");
		Contact l3  =new Contact("上官如", "948895554");
		Contact l4  =new Contact("独步王", "3218705554");
		c.add(l1);
		c.add(l2);
		c.add(l3);
		c.add(l4);
		Iterator<Contact> it = c.iterator();
		
		while (it.hasNext()) {
			if(it.next().getName().contains("杨")) {
				it.remove();
			}
		}
		System.out.println(c.toString());*/
		ContactManager c = new ContactManager();
		c.addContact();
		c.removeContact();
		c.updateContact();
		c.serachContact();
	}
}
