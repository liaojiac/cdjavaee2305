package day16.work;

public class Contact {
private String name;
private String number;
public Contact(String name, String number) {
	super();
	this.name = name;
	this.number = number;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public String toString() {
	return "联系人姓名:"+name+"\t"+"电话:"+number+"\n";
	
}
}
