package day10.saturday;

public class Vehicle {
	 String color;
	 int seatNumber;
     boolean isStart;
	public Vehicle() {
		
	}
	public Vehicle(String color, int seatNumber) {
		super();
		this.color = color;
		this.seatNumber = seatNumber;
	}
	public void run() {
		if(isStart) {
		System.out.println("已经启动了，请勿重复启动");
		}else {
			System.out.println("启动成功");
			isStart=true;
		}
		
		}
	}
	

