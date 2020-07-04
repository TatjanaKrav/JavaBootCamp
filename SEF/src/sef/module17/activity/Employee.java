package sef.module17.activity;
// Complete Code
class Employee extends EmployeeJDBC2 {

	String id;
	String firstName;
	String lastName;
	int salary;
	
	    public Employee(){
	    	this.id = "0";
	    	this.firstName = "Unknown";
	    	this.lastName = "Unknown";
	    	this.salary = 0;
	    }

	    
	    public Employee (String id, String firstName, String lastName, int salary) {
	    	
	    	this.id = id;
	    	this.firstName = firstName;
	    	this.lastName = lastName;
	    	this.salary = salary;
	    	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
