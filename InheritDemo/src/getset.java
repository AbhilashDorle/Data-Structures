class student
{
	private int rollno;
	private String name;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class getset {

	public static void main(String[] args) {
	student s = new student();
	s.setName("Bruce");
	s.setRollno(2);
	System.out.println(s.getName());
	System.out.println(s.getRollno());

	}

}
