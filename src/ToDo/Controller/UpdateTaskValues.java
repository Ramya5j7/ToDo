package ToDo.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ToDo.DAO.SqlOperation;


@WebServlet("/UpdateTaskValues")
public class UpdateTaskValues extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UpdateTaskValues() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession s=request.getSession();
		String name=(String) s.getAttribute("name");
		String Date=request.getParameter("Date");
		String Time=request.getParameter("Time");
		PrintWriter p=response.getWriter();
		SqlOperation obj=new SqlOperation();

		int flag=obj.UpdateTaskValues(name,Date,Time);
		if(flag==1) {
		p.println("<script>alert('Task updated successfully.')</script>");
		response.setHeader("Refresh", "1;ViewTask.jsp");
		}
		else {
		p.println("<script>alert('Task update failed.')</script>");
		response.setHeader("Refresh", "1;ViewTask.jsp");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
