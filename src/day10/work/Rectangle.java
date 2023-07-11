package day10.work;

public class Rectangle {
	 double chang;
	 double kuang;
	public Rectangle() {
		
	}
	public Rectangle(double chang, double kuang) {

		this.chang = chang;
		this.kuang = kuang;
	}
	public double circumference(double chang,double kuang) {
		double cf =2*(chang+kuang);
		return cf;
	}
	public double size(double chang,double kuang) {
		double m =chang*kuang;
		return m;
	}
}
