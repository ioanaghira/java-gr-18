package tema10.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/ViewUser")
public class ViewUser extends HttpServlet {

    Connection connection;
    ResultSet resultSet;


    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/usermanagement", "postgres", "postgres");


            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from user_model");

            out.println("<table cellspacing = '0' width = '350px' border ='1'>");
            out.println("<tr>");
            out.println("<td>UserId</td>");
            out.println("<td>UserName</td>");
            out.println("<td>UserEmail</td>");
            out.println("<td>UserType</td>");
            out.println("<td>Edit</td>");
            out.println("<td>Delete</td>");
            out.println("</tr>");

            while (resultSet.next()) {
                out.println("<tr>");
                out.println("<td>" + resultSet.getString("id") + "</td>");
                out.println("<td>" + resultSet.getString("name") + "</td>");
                out.println("<td>" + resultSet.getString("email") + "</td>");
                out.println("<td>" + resultSet.getString("type") + "</td>");

                out.println("<td>" + "<a href ='EditUser?id=" + resultSet.getString("id") + "'> Edit </a>" + "</td>");
                out.println("<td>" + "<a href ='DeleteUser?id=" + resultSet.getString("id") + "'> Delete </a>" + "</td>");


                out.println("</tr>");
            }
            out.println("</table>");

            out.println("<p><a href = /tema10 >Register User</a></p>");

        } catch (ClassNotFoundException | SQLException e) {
            out.println("Failed loading page!");
            out.println(e);

        }

    }
}
