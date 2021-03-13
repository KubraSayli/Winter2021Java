package pojos;

/*
POJO: Plain Old Java Object
POJO is a class.
To create POJO Class we need to do followings;
1)Create "private" for every key of JSON Data 
2)Create all getters and setters for the private variables. 
3)Create constructor without parameters
4)Create Constructor with all parameters
5)Create toString()  
*/

public class TodosPojo {
	
	//1)Create "private" variables for every key of JSON Data
	private int userId;
	private int id;
	private String title;
	private boolean completed;
	//private int statusCode = 201;
	
	//Create all getters and setter for the private variables 
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	
//	public int getStatusCode() {
//		return statusCode;
//	}
//	public void setStatusCode(int statusCode) {
//		this.statusCode = statusCode;
//	}
	
	//3)Create Constructor without parameter (Remova super();)
	
	public TodosPojo() {
		
	}
	
	
	//4)Create Constructor with all parameters 
	
	public TodosPojo(int userId, int id, String title, boolean completed) {
		super();
		this.userId = userId;
		this.id = id;
		this.title = title;
		this.completed = completed;
	}
	
	
	//5)Create toString 
	@Override
	public String toString() {
		return "TodosPojo [userId=" + userId + ", id=" + id + ", title=" + title + ", completed=" + completed + "]";
	}

	
}
