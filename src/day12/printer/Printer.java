package day12.printer;

public class Printer {
	IInkBok inkBok;
	IPaper paper;
	public void printer(IInkBok inkBok,IPaper paper) {
		System.out.println(inkBok.getColor()+paper.getSize());
	}
	
}
