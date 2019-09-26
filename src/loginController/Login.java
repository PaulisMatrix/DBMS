package loginController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import doa.DoaInterfaceImple;
import entity.PeopleInfo;


public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	DoaInterfaceImple logindoa;
	
	
    
   
    public Login() {
        logindoa=new DoaInterfaceImple();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String location=request.getParameter("location");
		String dob=request.getParameter("dob");
		String pass=request.getParameter("password");
		String action=request.getParameter("perform");
		
		
		PeopleInfo pi=new PeopleInfo();
		pi.setId(id);
		pi.setName(name);
		pi.setLocation(location);
		pi.setDob(dob);
		pi.setPassword(pass);
		
	    if(action.equals("add"))
	    	logindoa.save(pi);
	    
		
		
		
		//request.getRequestDispatcher("Views/Welcome.jsp").forward(request, response);
	}

}












