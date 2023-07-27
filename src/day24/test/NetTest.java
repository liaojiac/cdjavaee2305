package day24.test;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.management.openmbean.OpenMBeanAttributeInfo;

public class NetTest {
public static void main(String[] args) throws Exception {
	InetAddress ia1=InetAddress.getByName("10.7.161.63");
	System.out.println(ia1.getHostAddress());
	System.out.println(ia1.getHostName());
	InetAddress ia2=InetAddress.getByName("10.7.161.60");
	System.out.println(ia2.getHostAddress());
	System.out.println(ia2.getHostName());
	InetAddress ia3=InetAddress.getByName("baidu.com");
	System.out.println(ia3.getHostAddress());
	System.out.println(ia3.getHostName());
}
}
