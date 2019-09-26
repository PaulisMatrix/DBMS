package loginController2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import doa.DoaInterfaceImple;


public class Login2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	DoaInterfaceImple logindoa;

	
    public Login2() {
        logindoa = new DoaInterfaceImple();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String username = request.getParameter("username");
		String password=request.getParameter("password");
		
		System.out.println(username);
		System.out.println(password);
		
		if(logindoa.checkuser(username, password))
			System.out.println("Login Successful!!");
		else
			System.out.println("Login Failed!!");
	}

}
