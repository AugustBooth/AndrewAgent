package test.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class SayHelloInternationalized extends HttpServlet {

    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) 
                         throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        Locale locale = request.getLocale(); 
        String bundleName = "test.web.messages";
        ResourceBundle resources = ResourceBundle. 
            getBundle(bundleName, locale);
        String greeting = resources.getString("SayHello.hello");
        writer.append(greeting);
    } 

}