package example.firstweb;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "AppScope01", value = "/AppScope01")
public class AppScope01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF=8");

        PrintWriter out = response.getWriter();

        ServletContext application = getServletContext(); //application scope에 해당하는 객체

        int value = 1;
        application.setAttribute("value", value); // key-value

        out.println("<h1>value :  " + value + "</h1>");
    }
}
