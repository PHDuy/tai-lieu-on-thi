package vn.edu.tdc.sqliteexample.models;

public class Account {
	private String id;
	private String name, password;
	//private String status;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	/*public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}*/
	public Account(String id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		//this.status = status;
	}
	public Account() {
		super();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ("Id:"+id+" name:"+name+" pass:"+password);
	}
}
