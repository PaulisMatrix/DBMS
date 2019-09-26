package doa;

import java.sql.*;
import java.util.*;
import connectionUtil.DBConnectionUtil;
import entity.PeopleInfo;

public class DoaInterfaceImple implements DoaInterface {

		
	//define the properties
		Connection connection=null;
		Statement statement=null;
		ResultSet resultSet=null;
		PreparedStatement preparedStatement=null;
		
		
	
	@Override
	public List<PeopleInfo> displaylist() {
		
		//create a reference variable
		//List<PeopleInfo> list=null;
		//PeopleInfo info=null;
		
		
		return null;
	}

	@Override
	public void save(PeopleInfo pi) {
	
	
		try {
			
		
			
			String sql="INSERT INTO login(id,name,location,dob) VALUES('"+pi.getId()+"','"+pi.getName()+"','"+pi.getLocation()+"','"+pi.getDob()+"')";
			connection=DBConnectionUtil.openConnection();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.executeUpdate();
			
			sql="INSERT INTO login2(username,password) VALUES('"+pi.getName()+"','"+pi.getPassword()+"')";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.executeUpdate();
		
		}
		catch(SQLException E) 
		{
			E.printStackTrace(); 
			
		}
	
	
	}

	@Override
	public boolean checkuser(String username, String password) {
		
		try {
			String sql=" SELECT * FROM login2 WHERE username='"+username+"' AND password='"+password+"' ";
			connection=DBConnectionUtil.openConnection();
			preparedStatement = connection.prepareStatement(sql);
			resultSet=preparedStatement.executeQuery();
			
			if(!resultSet.next())
				return false;
			return true;
		}
		catch(SQLException E) 
		{
			E.printStackTrace(); 
			
		}
		
		return false;
	}

}
