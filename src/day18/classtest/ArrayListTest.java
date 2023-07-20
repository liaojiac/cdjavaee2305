package day18.classtest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList();
		ar.add(1);
		LinkedList<Integer> li = new LinkedList<>();
		li.add(1);
		li.add(0, null);
		HashMap<Integer,String> hs = new HashMap(5);
		hs.put(null, null);
	}
}
