package day10.petsystem;

public class Pet {
	String color;
	String variety;
	double intimacy;
	double healthIndex;
	boolean isAdopt;
	double satiety;
	boolean isLife=true;
	
	public Pet(String color, String variety, double intimacy, double healthIndex, boolean isAdopt, double satiety) {
		super();
		this.color = color;
		this.variety = variety;
		this.intimacy = intimacy;
		this.healthIndex = healthIndex;
		this.isAdopt = isAdopt;
		this.satiety = satiety;
	}
	public Pet() {
		
	}

	public void adopt() {
		if(isAdopt) {
			System.out.println("已经被领养了");
		}else {
			System.out.println("领养成功");
			isAdopt=true;
		}
	}
	public void feed() {
		if(satiety<100) {
			satiety+=5;
			if(healthIndex<=95) {
			healthIndex+=5;
			}
			System.out.println("饱食度+5"+","+"目前饱食度："+satiety+"\n"+"健康值+5"+"目前健康值:"+healthIndex);
		}else {
			System.out.println("你的宠物快要撑死了");
		}
	}
	public void play() {
		intimacy+=20;
		if(healthIndex<=95) {
			healthIndex+=5;
			}
		System.out.println("当前亲密度:"+intimacy+"它非常高兴"+"目前健康值:"+healthIndex);
	}
	public void hit() {
		if(isLife==true) {
		intimacy-=30;
		if(healthIndex>=20) {
		healthIndex-=20;}else 
		{healthIndex=0;}
		System.out.println("当前亲密度:"+intimacy+"它很伤心"+"目前健康值:"+healthIndex);
		}
		if(healthIndex==0) {
			System.out.println("你的宠物被打死了");
			isLife=false;
		}
		
	}
}
