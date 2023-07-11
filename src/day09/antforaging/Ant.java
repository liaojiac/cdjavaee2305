package day09.antforaging;

public class Ant {
	String species;
	int population;
	Food food;
	public Ant() {
		
	}
	public Ant(String species,int population) {
		this.species=species;
		this.population=population;
	}
	public void findfood(Food food) {
		System.out.println(population+"只"+species+"发现了"+food.size+"寸"+food.name);
	}
	public void summon(Food food) {
		if(food.size<10) {
			population=10;
		}else if(food.size>=10&&food.size<20) {
			population=20;
		}else {
			population=30;
		}
		System.out.println("召唤了"+population+"只"+species);
	}
}
