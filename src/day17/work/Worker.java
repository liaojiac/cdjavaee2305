package day17.work;

public class Worker {
	private String name;
	private int age;
	private int workerAge;
	private int salary;
	
	
	public Worker(String name, int age, int workerAge, int salary) {
		this.name = name;
		this.age = age;
		this.workerAge = workerAge;
		this.salary = salary;
	}

	public Worker() {

	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWorkerAge() {
		return workerAge;
	}
	public void setWorkerAge(int workerAge) {
		this.workerAge = workerAge;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Worker [name=" + name + ", age=" + age + ", workerAge=" + workerAge + ", salary=" + salary + "]";
	}
	
	
}
