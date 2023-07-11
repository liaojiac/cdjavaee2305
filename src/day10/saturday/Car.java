package day10.saturday;

public class Car extends Vehicle{
	String brand;

	public Car() {
		super();
	}

	public Car(String color, int seatNumber,String brand) {
		super(color,seatNumber);
		this.brand = brand;
	}
	public void hurricane() {
		if(isStart) {
			System.out.println("你的"+color+seatNumber+"座"+brand+"开始狂飙");
		}else {
			System.out.println("请启动车辆");
		}
	}
}
