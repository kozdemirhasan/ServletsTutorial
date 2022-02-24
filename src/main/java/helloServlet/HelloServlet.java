package helloServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		PrintWriter printWriter  = response.getWriter();
		
		String message = "<h1>Hello Servlet! My name is Hasan Murat :)</h1>";
		
		printWriter.write(message);
		
	}

}
