package day17.work;

import java.util.Objects;

public class Student {
	private String name;
	private int cardId;

	public Student() {
	}

	public Student(String name, int cardId) {
		this.name = name;
		this.cardId = cardId;
	}

	public int getCardId() {
		return cardId;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", cardId=" + cardId + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cardId, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return cardId == other.cardId && Objects.equals(name, other.name);
	}
	
}
