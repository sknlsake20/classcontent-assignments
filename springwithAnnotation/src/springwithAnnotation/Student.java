package springwithAnnotation;

public class Student {
	
	private int studentid;
	private String studentname;
	private String studentaddress;
	
	

	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + ", studentaddress=" + studentaddress
				+ "]";
	}



	public Student(int studentid, String studentname, String studentaddress) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
		this.studentaddress = studentaddress;
	}



	public int getStudentid() {
		return studentid;
	}



	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}



	public String getStudentname() {
		return studentname;
	}



	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}



	public String getStudentaddress() {
		return studentaddress;
	}



	public void setStudentaddress(String studentaddress) {
		this.studentaddress = studentaddress;
	}



	public Student() {
		// TODO Auto-generated constructor stub
	}

}
