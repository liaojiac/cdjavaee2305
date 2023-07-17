package day16.work;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactManager {
	private ArrayList<Contact> contacts;
public ArrayList<Contact> getContact() {
	return contacts;
}
public void setContact(ArrayList<Contact> contact) {
	this.contacts = contact;
}
public ContactManager() {
	this.contacts = new ArrayList<>();
}
public void addContact() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("请输入联系人姓名: ");
    String name = scanner.nextLine();
    System.out.print("请输入联系人电话: ");
    String number = scanner.nextLine();
    Contact contact = new Contact(name, number);
    contacts.add(contact);
    System.out.println("联系人添加成功！");
    System.out.println("目前联系人:"+contacts.toString());
}
public void removeContact() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("请输入要删除的联系人姓名: ");
    String name = scanner.nextLine();
    boolean isflag = false;
   for (Contact con : contacts) {
	if(con.getName().equals(name)) {
		contacts.remove(con);
		isflag =true;
		break;
	}
}
   if(isflag) {
	   System.out.println("已经删除该联系人");
   }else {
	   System.out.println("未找到该联系人");
   }
   System.out.println("目前联系人:"+contacts.toString());
}
public void updateContact() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("请输入要修改的联系人姓名: ");
    String name = scanner.nextLine();
    boolean isflag = false;
   for (Contact con : contacts) {
	if(con.getName().equals(name)) {
		System.out.println("请输入新的联系人电话");
		String number = scanner.nextLine();
		con.setNumber(number);
		isflag =true;
		break;
	}
}
   if(isflag) {
	   System.out.println("已经修改该联系人");
   }else {
	   System.out.println("未找到该联系人");
   }
   System.out.println("目前联系人:"+contacts.toString());
}
public void serachContact() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("请输入要查找的联系人姓名: ");
    String name = scanner.nextLine();
    boolean isflag = false;
   for (Contact con : contacts) {
	if(con.getName().equals(name)) {
		
		System.out.println("姓名"+con.getName()+"\t"+"电话"+con.getNumber());
		isflag =true;
		break;
	}
}
   if(isflag) {
	   
   }else {
	   System.out.println("未找到该联系人");
   }

}
}
