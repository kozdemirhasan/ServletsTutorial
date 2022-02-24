package servletConfig;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletConfigClass
 */
@WebServlet("/ServletConfigClass")
public class ServletConfigClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
  

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		ServletConfig config = getServletConfig();
		
		response.getWriter().write("<html><body>");
		response.getWriter().write("<h1>");
		
		response.getWriter().write(config.getInitParameter("akinHoca"));
		response.getWriter().write("<br/>");
		
		response.getWriter().write(config.getInitParameter("leventHoca"));
		response.getWriter().write("<br/>");
		
		response.getWriter().write("Servlet adi: "+config.getServletName());
		
		response.getWriter().write("</h1>");
		response.getWriter().write("</body></html>");
	}

	

}
