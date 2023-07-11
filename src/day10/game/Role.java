package day10.game;
import java.util.Random;

public class Role {
	private String name;
	private int blood;
	private String gender;
	private String face;
	//男生长相数组
	String[] boyfaces = {"风流俊雅", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
	//女生长相数组
	String[] girlfaces = {"美奂绝伦", "沉鱼落雁", "婷婷玉立", "身材娇好", "相貌平平", "相貌简陋", "惨不忍睹"};
	//attack 攻击描述：
	String[] attacks_desc = {
	    "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
	    "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
	    "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
	    "%s运气于掌，一瞬间掌心变得血红，一式【降龙十八掌】，推向%s。",
	    "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
	    "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"};
	//injured 受伤描述：
	String[] injureds_desc = {
	    "结果%s退了半步，毫发无损",
	    "结果给%s造成一处瘀伤",
	    "结果一击命中，%s痛得弯下腰",
	    "结果%s痛苦地闷哼了一声，显然受了点内伤",
	    "结果%s摇摇晃晃，一跤摔倒在地",
	    "结果%s脸色一下变得惨白，连退了好几步",
	    "结果『轰』的一声，%s口中鲜血狂喷而出",
	    "结果%s一声惨叫，像滩软泥般塌了下去"};
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFace() {
		return face;
	}
	public void setFace(String gender) {
		Random r = new Random();
		//长相是随机的，还需判断性别
		if(gender=="男") {
			int index = r.nextInt(boyfaces.length);
			this.face=boyfaces[index];
		}
		if(gender=="女  ") {
			int index = r.nextInt(girlfaces.length);
			this.face=girlfaces[index];
		}
	}
	public Role(String name, int blood, String gender, String face, String[] boyfaces, String[] girlfaces) {
		super();
		this.name = name;
		this.blood = blood;
		this.gender = gender;
		this.face = face;
		this.boyfaces = boyfaces;
		this.girlfaces = girlfaces;
	}
	public Role(String name, int blood,String gender) {
		super();
		this.name = name;
		this.blood = blood;
		this.gender =gender;
		setFace(gender);
	}
	public Role() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBlood() {
		return blood;
	}
	public void setBlood(int blood) {
		this.blood = blood;
	}
	public void attack(Role role) {
		Random r =new Random();
		int index = r.nextInt(attacks_desc.length);
		String kungfu =attacks_desc[index];
		
		//输出攻击招式
		System.out.printf(kungfu,this.getName(),role.getName());
		System.out.println();
		//计算造成的伤害
		int hurt =   r.nextInt(20)+1;
		 //修改一下被打人物的血量
		int remainBoold =role.getBlood()-hurt;
		//剩余血量为负数，就修改其为0
		remainBoold =remainBoold<0?0: remainBoold;
		role.setBlood(remainBoold);
		//受伤描述，根据血量判断
		if (remainBoold > 90) {
            System.out.printf(injureds_desc[0], role.getName());
        }else if(remainBoold > 80 && remainBoold <= 90){
            System.out.printf(injureds_desc[1], role.getName());
        }else if(remainBoold > 70 && remainBoold <= 80){
            System.out.printf(injureds_desc[2], role.getName());
        }else if(remainBoold > 60 && remainBoold <= 70){
            System.out.printf(injureds_desc[3], role.getName());
        }else if(remainBoold > 40 && remainBoold <= 60){
            System.out.printf(injureds_desc[4], role.getName());
        }else if(remainBoold > 20 && remainBoold <= 40){
            System.out.printf(injureds_desc[5], role.getName());
        }else if(remainBoold > 10 && remainBoold <= 20){
            System.out.printf(injureds_desc[6], role.getName());
        }else{
            System.out.printf(injureds_desc[7], role.getName());
        }
		System.out.println();
		
	}
	public void showRoleInfo() {
		System.out.println("姓名为"+getName());
		System.out.println("血量："+getBlood());
		System.out.println("性别："+getGender());
		System.out.println("长相："+getFace());
	}
	
}
