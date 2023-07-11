package day11.pet;

public class Master {
	public void feed(Pet pet) {
		pet.eat();
	}

	public void hit(Pet pet) {
		pet.hited();
	}

	public Pet getPet(int index) {
		Pet pet = null;
		if (index == 1) {
			pet = new Dog("狗", 50, 50, "萨摩亚");
		} else if (index == 2) {
			pet = new Penguin("企鹅", 55, 50, "黑白相间");
		}
		return pet;
	}

	public void play(Pet pet) {
		if (pet instanceof Dog) {
			((Dog) pet).catchDisk();
		} else if (pet instanceof Penguin) {
			((Penguin) pet).swim();
		}
	}

}
