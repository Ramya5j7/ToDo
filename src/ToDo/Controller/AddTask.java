package ToDo.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ToDo.DAO.SqlOperation;



@WebServlet("/AddTask")
public class AddTask extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AddTask() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("servlet ccalled");	
		PrintWriter p=response.getWriter();
		 String name = request.getParameter("Task name");
		 String Date = request.getParameter("Remainder Date");
		 String Time = request.getParameter("Remainder Time");
		 System.out.println(name+""+Date+""+Time);
		 

    SqlOperation dao=new SqlOperation();
       if(dao.AddTask(name, Date, Time)==1)  {
    	   p.println("<script type=\"text/javascript\">");
    	   p.println("alert(\"Task Added Successfully \")");
    	   p.println("</script>");
    	   response.setHeader("Refresh", "1;TaskPage.html");
    	   }else {
    	   p.println("<script type=\"text/javascript\">");
    	   p.println("alert(\"Task Failed\")");
    	   p.println("</script>");
    	   response.setHeader("Refresh", "1; AddTask.html");
  }


	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
