package day06;
import java.util.Scanner;

public class Test01 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入3条边");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        jiao(a, b, c);
    }

    public static void jiao(double a, double b, double c) {
        if (isTriangle(a, b, c)) {
            double cosA = cosAngle(a, b, c);
            if (cosA == 0) {
                System.out.println("直角");
            } else if (cosA > 0) {
                System.out.println("锐角");
            } else {
                System.out.println("钝角");
            }
        } else {
            System.out.println("无法构成三角形");
        }
    }

    public static boolean isTriangle(double a, double b, double c) {
        return (a + b > c && a + c > b && b + c > a);
    }

    public static double cosAngle(double a, double b, double c) {
    	double m =0;
    	if(a<b) {
    		m=a;
    		a=b;
    		b=m;		
    	}
    	if(a<c) {
    		m=a;
    		a=c;
    		c=m;
    	}
        double cosA = ((b * b + c * c - a * a) / (2.0 * b * c));
        return cosA;
    }
}

