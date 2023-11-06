

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DateServlet
 */
@WebServlet("/DateServlet")
public class DateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw;
		response.setContentType("text/html");
		pw=response.getWriter();
		
		HttpSession session=request.getSession();
		
		if(session.getAttribute("count")==null) {
			pw.println("<h1>Hi this is your first visit!!</h1>");
			session.setAttribute("count", new Integer(1));
			session.setAttribute("date", LocalDate.now());
		}
		else {
			int count=(Integer)session.getAttribute("count");
			count=count+1;
			LocalDate lastVisited=(LocalDate)session.getAttribute("date");
			pw.println("<h2>Visit No:"+count);
			pw.println("<br>Last Visited: "+lastVisited.toString());
			
			session.setAttribute("count", new Integer(count));
			session.setAttribute("date", LocalDate.now());
		}
		
		pw.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
