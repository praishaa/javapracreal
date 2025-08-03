class details{
	private String name;
	private int age;

public String getname() {
	return name;
}
public int getage() {
	return age;}
public void setdetails(String nname,int ages) {
	name=nname;
	age=ages;
}
}

public class student {
	public static void main(String[] args) {
		details stud1=new details();
		stud1.setdetails("isha",20);
		System.out.println(stud1.getname());
		System.out.println(stud1.getage());
	}
}
