package day10.work;

public class Test {
	public static void main(String[] args) {
		Rectangle r =new Rectangle(10,20);
		Column c = new Column(r,30);
		double v =c.volume();
		System.out.println(v);
		
	}
	
}
