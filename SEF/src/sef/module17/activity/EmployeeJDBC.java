package sef.module17.activity;
//Needs to be completed
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeJDBC {

	public Connection createConnection()
	{
		Connection con=null;
		String url = "jdbc:mysql://localhost:3306/employees"; 
		String user = "root";
		String pass = "tanjandrej";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection successfully established!");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
	
	public Employee findEmployeeById(String id)
	{
		Connection con = createConnection();
		Employee emp=null;
		try {
		// 1 - Create a PreparedStatement with a query
		String query = "SELECT * FROM EMPLOYEES WHERE ID = '2a'";
		PreparedStatement st = con.prepareStatement(query);

		// 2 - Search for the given id
		

		// 3 - Execute this query
		ResultSet employeeById = st.executeQuery(query);
		
		// 4 - If resultset is not null, then initialize emp object with data 
		if (employeeById != null) {
			String currentemployee = "";
			currentemployee = 	employeeById.getString(1) + " : " + 	 
					employeeById.getString(2) + " : " +
					employeeById.getString(3) + " : " +
					employeeById.getInt(4);
			System.out.println(currentemployee);
		}else {
			System.out.println("No such employee");
		}
		con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return emp;
	}

	public ArrayList<Employee> findEmployeesByName(String name)
	{
		Connection con = createConnection();
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		try {
		// 1 - Create a PreparedStatement with a query
		String query = "SELECT * FROM EMPLOYEES WHERE NAME= '\"+Abbey+\"'";
		PreparedStatement st = con.prepareStatement(query);

		// 2 - Search for the given id
		
		// 3 - Execute this query
		ResultSet employeeByName = st.executeQuery(query);
		
		// 4 - While there are some records, continue 
		String employeeName = "";
		while (employeeByName.next()) {		
			employeeName = 	employeeByName.getString(1) + " : " + 	
					employeeByName.getString(2) + " : " +
					employeeByName.getString(3) + " : " +
					employeeByName.getInt(4);
			System.out.println(employeeName);
		}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	public ArrayList<Employee> findEmployeesBySalary(int salary)
	{
		Connection con = createConnection();
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		try {
		// 1 - Create a PreparedStatement with a query
		
		String query = "SELECT * FROM EMPLOYEES WHERE SALARY= '2000'";
		PreparedStatement st = con.prepareStatement(query);
		// 2 - Search for the given salary
		

		// 3 - Execute this query
		ResultSet employeeBySalary = st.executeQuery(query);
		
		// 4 - While there are records, continue 
		String employeeSalary = "";
		while (employeeBySalary.next()) {		
			employeeSalary = 	employeeBySalary.getString(1) + " : " + 	
					employeeBySalary.getString(2) + " : " +
					employeeBySalary.getString(3) + " : " +
					employeeBySalary.getInt(4);
			System.out.println(employeeSalary);
		}
		
		con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	public void insertEmployee(Employee emp)
	{
		try {
		Connection con = createConnection();
		
		//1 - Create a PreparedStatement with a query "insert into employee values(?,?,?,?)" 
		String query = "insert into employees values (?,?,?,?)";
		con.setAutoCommit(false);

		//	Substitute the ? now.
	 query = "insert into employees values (4k,Helena,Mirray,2500)";
		//2 - Execute this query using executeUpdate()
		PreparedStatement st = con.prepareStatement(query); 
		st.setString(1, "4k");		
		st.setString(2, "Helena");
		st.setString(3, "Mirray");
		st.setInt(4, 2500);
		int count = st.executeUpdate();	
		System.out.println(count + " row(s) added!");
		
		
		con.commit();
		con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
	

