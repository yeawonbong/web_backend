package example.firstweb;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "AppScope02", value = "/AppScope02")
public class AppScope02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF=8");

        PrintWriter out = response.getWriter();

        ServletContext application = getServletContext(); //application scope에 해당하는 객체
        try {

        int value = (int)application.getAttribute("value"); //인자 찾아올 key 이름
        value++;
        application.setAttribute("value", value); // key-value

        //application.setAttribute("value", (int)application.getAttribute("value") + 1);

        out.println("<h1>value :  " + value + "</h1>");
        } catch (NullPointerException e) {
            out.println("value의 값이 설정되지 않았습니다.");
        }
    }
}
