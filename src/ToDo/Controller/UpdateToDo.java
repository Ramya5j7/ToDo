package ToDo.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ToDo.Bean.Task;
import ToDo.DAO.SqlOperation;


@WebServlet("/UpdateToDo")
public class UpdateToDo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UpdateToDo() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");  
		HttpSession s=request.getSession();
		String name=(String) s.getAttribute("name");
		System.out.println("Session Value "+name);
		Task t =SqlOperation.fetchTask(name);
		System.out.println("From Servlet :: "+t);
		request.setAttribute("UpdateTask",t);
		request.getRequestDispatcher("UpdateTask.jsp").forward(request, response);

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
