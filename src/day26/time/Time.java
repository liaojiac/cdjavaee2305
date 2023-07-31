package day26.time;

import java.text.DateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Set;
public class Time {
public static void main(String[] args) {
//	//创建本地时间
//	LocalDateTime lt = LocalDateTime.now();
//	System.out.println(lt);
//	//增加100天
//	LocalDateTime lt1 = lt.plusDays(100);
//	System.out.println(lt1);
//	//减少
//	LocalDateTime lt2 = lt.minusYears(1000);
//	System.out.println(lt2);
//	//获取当前默认时区
//	ZoneId z = ZoneId.systemDefault();
//	System.out.println(z);
	//获取所有时区
//	Set<String> sz =ZoneId.getAvailableZoneIds();
//	for (String str : sz) {
//		System.out.println(str);
//	}
	//新旧时间的转换
	Date date = new Date();//旧
	System.out.println(date);
	Instant ins = date.toInstant();
	LocalDateTime ofInstant = LocalDateTime.ofInstant(ins, ZoneId.systemDefault());
	System.out.println(ofInstant);
	LocalDateTime ld =LocalDateTime.now();
	System.out.println(ld);
	Instant ins1 = ld.atZone(ZoneId.systemDefault()).toInstant();
	Date date1 = Date.from(ins1);
	System.out.println(date1);
	//新时间的格式化
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
	String fmt =ld.format(dtf);
	System.out.println(fmt);
	//解析任意的时间
	String time = "2077年12月12日 17:16:15";
	LocalDateTime ldt1 = LocalDateTime.parse(time, dtf);
	System.out.println(ldt1);
}
}
