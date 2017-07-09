
public class Student {

	private String Name;
	private String phone_num;
	private int roll_no;
	private String class_name;
	
	public void setStudentInfo(String nam,String phone,int rollno,String clsname){
		this.Name = nam;
		this.phone_num = phone;
		this.roll_no = rollno;
		this.class_name = clsname;
	}
	//setter method
	public String getStudentInfoName(){
		return this.Name;
	}
	
	// getter method
	public String getStudentInfoPhone(){
		return this.phone_num;
	}
	public String getStudentInfoClassName(){
		return this.class_name;
	}
	public int getStudentInfoRollNo(){
		return this.roll_no;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stu_name;
		String stu_phone;
		String stu_class_name;
		int stu_roll;
		Student info = new Student();
		info.setStudentInfo("PLABAN", "7735535292", 1, "SLB");
		stu_name = info.getStudentInfoName();
		System.out.println("Student Name Is : " + stu_name);
		stu_phone = info.getStudentInfoPhone();
		System.out.println("Student Phone Number Is : " + stu_phone);
		stu_class_name = info.getStudentInfoClassName();
		System.out.println("Student Class Name Is : " + stu_class_name);
		stu_roll = info.getStudentInfoRollNo();
		System.out.println("Student Roll Number Is : " + stu_roll);
		
	}

}
