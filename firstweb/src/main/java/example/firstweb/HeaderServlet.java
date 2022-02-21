package example.firstweb;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet(name = "HeaderServlet", value = "/header")
public class HeaderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter(); //클라이언트와의 연결통로 하나 생성
        out.println("<html>");
        out.println("<head><title>form</title></head>");
        ((PrintWriter) out).println("<body>");

        //Enumeration: 문자열
        Enumeration<String> headerNames = request.getHeaderNames(); // 요청객체를 통해 헤더 이름을 받아온다.
        while(headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            String headerValue = request.getHeader(headerName); // 헤더의 값 정보를 알아낼 수 있다.
            out.println(headerName + " : " + headerValue + " <br> "); // 헤더의 이름과 값을 PrintWriter에 쓴다.
        }

        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
