package k_day21_accessmodifierstringbuilder;


public class Encapsulation01s {
	//!!!hap çiz 
	/*
	  1)Encapsulation means "data hiding"
	  2)How do you achieve "encapsulation"?
	  		a)Make the variables private
	  		!!!to data hiding and make the code simple
	  		!!!but I need to use it ssn 
	  		b)To read private variables values create get methods (getters)
	  		c)To update private variables create set methods (setter)
	 */
	
	private String ssn = "123456789";
	private String collegeName = "FIU";
	private int age = 23;
	private boolean old = false;
	public String getSsn() {
		return "*****" + ssn.substring(5);
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isOld() {
		return old;
	}
	public void setOld(boolean old) {
		this.old = old;
	}

	//!!!önce getters ,tek tek incele
	
	
}
