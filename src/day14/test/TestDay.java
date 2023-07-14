package day14.test;
import java.util.Date;
import java.text.*;
import java.util.Calendar;
public class TestDay {
public static void main(String[] args) {
	Date date =new Date();
	System.out.println(date);
	SimpleDateFormat sdf = new SimpleDateFormat("yyy年MM月dd日hh:mm:s");
	System.out.println("当前时间为:"+sdf.format(date));
	//获取一个Calendar对象
    Calendar calendar = Calendar.getInstance();
    int weekYear = calendar.get(Calendar.YEAR);
    //获得当前日期属于今年的第几周
    int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
    System.out.println(weekOfYear);
    //获取今天是今年第几天
    System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
}
}
