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
		//System.out.println(p1);
		People p= new People();
		Class c = p.getClass();
		c.equals(c);
		String str = "dfs";
		String s ="ssd";
		String x =new String("ssd");
		
		
		
		System.out.println(s==x);
		System.out.println(x);
		str.equals(s);
		str.toString();
		System.out.println(str.valueOf(100));
		System.out.println(p.toString());
		System.out.println(p);
		System.out.println(p.hashCode());
		System.identityHashCode(p1);
	}
	
}
