package day10.work;

public class Column {
	Rectangle rectangle;
	double high;
	
	public Column(Rectangle rectangle, double high) {
		super();
		this.rectangle = rectangle;
		this.high = high;
	}
	public void	surfaceArea(){
		
	}
	public double volume() {
	double v =rectangle.size(rectangle.chang,rectangle.kuang)*high;
	return v;
	}
}
