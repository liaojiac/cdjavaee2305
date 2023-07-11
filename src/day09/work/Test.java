package day09.work;

public class Test {
	public static void main(String[] args) {
	Person ren =new Person(18,'男',"张三");
	Vegetable cai=new Vegetable("土豆",5);
	KitchenKnife kn = new KitchenKnife(100,50,"高碳钢");
	
	ren.cut(kn, cai);
}
}
