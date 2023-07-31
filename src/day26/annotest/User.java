package day26.annotest;

@Table("users")
public class User {
	@Column(length = 20, name = "student_no", type = "varchar")
	private String studentNo;
	@Column(length = 20, name = "student_name", type = "varchar")
	private String name;
	@Column(length = 20, name = "phone_number", type = "varchar")
	private String phone;
}
