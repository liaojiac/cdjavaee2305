package day09.Loadingelephants;

public class Test {
	public static void main(String[] args) {
		Elephants e = new Elephants("亚洲象","两吨",'雄');
		Icebox ice = new Icebox("格力",1000.0);
		Person p = new Person(18,'男',"小明");
		ice.open(p);
		p.na(e);
		ice.zhuang(p, e);
		ice.close(p);
	}
}
