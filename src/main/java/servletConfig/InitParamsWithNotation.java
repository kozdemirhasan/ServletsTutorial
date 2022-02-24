package servletConfig;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "initParamsWithNotation", urlPatterns = {"/initParamsWithNotation"},
					initParams = {@WebInitParam(name="leventHoca", value="Levent Ergüder"),
								  @WebInitParam(name="akinHoca", value="Akin Kaldiroglu")})
public class InitParamsWithNotation extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter writer = response.getWriter();
		ServletConfig config = getServletConfig();
		Enumeration<String> initParameterList = config.getInitParameterNames();

		while (initParameterList.hasMoreElements()) {
			String string = (String) initParameterList.nextElement();
			writer.write(" " + string + " ");
		}

		writer.write(" " + config.getInitParameter("leventHoca") + " ");
		writer.write(" " + config.getInitParameter("akinHoca") + " ");

	}

}
