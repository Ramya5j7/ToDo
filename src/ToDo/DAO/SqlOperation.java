package ToDo.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ToDo.Bean.Task;
import ToDo.SqlOperation.DBConnector;




public class SqlOperation {
	static Connection con=null;
	public int AddTask(String name,String Date,String Time) {
		try {
			con=DBConnector.dbConnector();
			String query="insert into AddTask values(?,?,?)";
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1,name);
			st.setString(2, Date);
			st.setString(3, Time);
			
		int flag=	st.executeUpdate();
			System.out.println("AddTask successful");
			return flag;
			
		}catch (Exception e){System.out.println(e);}
		return 0;
	}
		
public static List<Task> TotalTask() {
	List<Task> TA = new ArrayList<Task>();
	try {
	con = DBConnector.dbConnector();
	Statement statement = con.createStatement();
	ResultSet resultSet = statement.executeQuery("select * from addtask");

	while (resultSet.next()) {
		Task t = new Task();
	t.setName(resultSet.getString("name"));
	t.setDate(resultSet.getString("Date"));
	t.setTime(resultSet.getString("Time"));
	
	System.out.println(t);
	   TA.add(t);
	}
	  return TA;
	} catch (Exception e) {System.out.println(e);}
	return null;
	}

public static Task fetchTask(String name) {
	con=DBConnector.dbConnector();
	String query="select * from addtask where name=?";
	System.out.println("task name"+name);

	try {
	PreparedStatement st=con.prepareStatement(query);
	st.setString(1, name);
	ResultSet rs=st.executeQuery();
	while(rs.next()) {
	Task t=new Task();
	t.setName(rs.getString("name"));
	t.setDate(rs.getString("Date"));
	t.setTime(rs.getString("Time"));
	System.out.println("from DAO ::"+t);
	return t;
	}
	} catch (SQLException e) {e.printStackTrace();}
	return null;
	}

public int UpdateTaskValues(String name, String Date, String Time) {
	{
		try {
		con=DBConnector.dbConnector();
		String query="update addtask SET  Date=?,Time=? where name=?";
		PreparedStatement st=con.prepareStatement(query);
		st.setString(1, Date);
		st.setString(2, Time);
		st.setString(3, name);
		int flag=st.executeUpdate();
		System.out.println(flag);
		System.out.println("Update Successfull");
		return flag;
		}
		catch (Exception e) {System.out.println(e);}
		return 0;
		}
    }
}

