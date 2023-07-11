package day10.test;

public class User {
	private String gender;
	String name;
	public void setGender(String gender) {
		if(gender.equals("男")||gender.equals("女")) {
			this.gender =gender;
		}else {
			this.gender ="男";
		}
	}
	public String getGender() {
		return gender;
	}

	
	
}
