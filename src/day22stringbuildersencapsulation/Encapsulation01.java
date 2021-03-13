package day22stringbuildersencapsulation;

public class Encapsulation01 {

	private String collegeName = "Colombia";//getter and setter
	private int age = 23;//getter and setter
	private boolean old = true;//getter and setter 
	private String ssn = "123456789";//getter
	private String name = "Kubra";//getter
	
	public String getCollegeName() {
		return collegeName;
	}
	public int getAge() {
		return age;
	}
	public boolean isOld() {
		return old;
	}
	public String getSsn() {
		return "*****"+ssn.substring(5);
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setOld(boolean old) {
		this.old = old;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	
	
}
