package day10.saturday;

public class Plane extends Vehicle{
	String flight;

	public Plane(String color, int seatNumber, String flight) {
		super(color, seatNumber);
		this.flight = flight;
	}

	public Plane() {
		super();
	}
	public void fly() {
		if(isStart) {
			System.out.println(flight+"起飞");
		}else {
			System.out.println("请启动飞机");
		}
	}
	
}
