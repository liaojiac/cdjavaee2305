package day13.hashtest;

public class Test {
	public static void main(String[] args) {
		/*People p = new People();
		int count =0;
		People p1 =new People();
		while(true) {
			count++;
			People p1=p;
			if(p.hashCode()==p1.hashCode() ) {
				System.out.println(p.hashCode()+","+p1.hashCode());
				break;
			}
		}*/
		People p1= new People();
		System.out.println(p1);
		People p= new People();
		Class c = p.getClass();
		System.out.println(c.toString());
		System.out.println(c.hashCode());
		System.identityHashCode(p1);
	}
	
}
