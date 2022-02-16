package dynamic_webapp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "TenServlet", value = "/ten")
public class TenServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.print("<h1>1-10까지 출력</h1>");
        for(int i=1; i <=10; i++) {
            out.print(i + "<br>");
        }
        out.close();
    }
}
