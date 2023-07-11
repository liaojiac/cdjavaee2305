package day12.test01;

public class SDoor extends Door implements Lock{

	public void openLock() {
		System.out.println("开锁");
	}

	public void closeLock() {
		System.out.println("关锁");
	}

	public void openDoor() {
		System.out.println("开门");
	}

	public void closeDoor() {
		System.out.println("关门");
	}

}
