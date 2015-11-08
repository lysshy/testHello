package ly.hello;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{

	 public void doGet(HttpServletRequest request,  
		        HttpServletResponse response) throws   
		        ServletException,IOException {  
		        //设定返回的内容的类型  
		        response.setContentType("text/html;charset=utf-8");  
		        //输出动态内容,这个out对象输出的内容都是输出到浏览器  
		        PrintWriter out = response.getWriter();  
		        out.println("<html>");  
		        out.println("<head>");  
		        out.println("<title>my first servlet.</title>");  
		        out.println("<body>");  
		        out.println(new Date());  
		        out.println("<br>");  
		        out.println("Welcome to my first Servlet!");  
		        out.println("</body>");  
		        out.println("</html>");  
		        out.flush();  
		        out.close();//关闭  
		    }  
		  
		    public void doPost(HttpServletRequest request,  
		        HttpServletResponse response) throws   
		        ServletException,IOException {  
		        doGet(request,response);//处理和doGet()方法一样。  
		    }  
}
