package day17.work;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String[] args) {
		TreeMap<Book, String> tr = new TreeMap<>(new Comparator<Book>() {
		    @Override
		    public int compare(Book o1, Book o2) {
		        if (o1.getBookprice() != o2.getBookprice()) {
		            return o1.getBookprice() - o2.getBookprice();
		        } else {
		            return o1.hashCode() - o2.hashCode();
		        }
		    }
		});
		Book b1 =new Book("红楼梦","古典小说",30);
		tr.put(b1,b1.getBookKind());
		Book b2 =new Book("西游记","古典小说",40);
		tr.put(b2,b2.getBookKind());
		Book b3 =new Book("水浒传","古典小说",35);
		tr.put(b3,b3.getBookKind());
		Book b4 =new Book("围城","现代小说",25);
		tr.put(b4,b4.getBookKind());
		Book b5 =new Book("活着","现代小说",31);
		tr.put(b5,b5.getBookKind());
		System.out.println(tr);
		
	}
}
