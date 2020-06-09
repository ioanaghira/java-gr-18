package tema10.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/hello")
public class LifeCycle extends HttpServlet {

    String output;

    public void init(ServletConfig config) {
        output = "servlet is initialized";

        System.out.println(output);
    }

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        out.print("<html><body>");
        out.print("<b>hello simple servlet</b>");
        out.print("</body></html>");

    }

    public void destroy() {
        output = "servlet is destroyed";

        System.out.println(output);
    }

}

