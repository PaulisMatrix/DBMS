package doa;
import entity.*;
import java.util.*;


public interface DoaInterface {
	
	//to add people to the table login
	List<PeopleInfo> displaylist();
	
	
	//display the people by retrieving them from the database
	void save(PeopleInfo pi);
	boolean checkuser(String username,String password);
	
	

}
