

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EvenOddServlet
 */
@WebServlet("/EvenOddServlet")
public class EvenOddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EvenOddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter pw;
		response.setContentType("text/html");
		pw=response.getWriter();
		
		//name of incoming parameter is number    http://localhost:8080/.../...?number=12
		
		String n=request.getParameter("number");
		int num=Integer.parseInt(n);
		
		
		   pw.println("<html><body>");
		   
		   
		if(num%2==0) {
			pw.println("<h1>"+num+" is an even number</h1>");
		}
		else {
			pw.println("<h1>"+num+" is an odd number</h1>");
		}
				
		
	}

}
