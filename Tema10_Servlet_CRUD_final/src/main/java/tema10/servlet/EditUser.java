package tema10.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/EditUser")
public class EditUser extends HttpServlet {
    Connection connection;
    PreparedStatement preparedStatement;
    ResultSet resultSet;



    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String uid = req.getParameter("id");



        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/usermanagement", "postgres", "postgres");
            preparedStatement = connection.prepareStatement("select * from user_model where id= ?");

            preparedStatement.setInt(1, Integer.parseInt(uid));

            resultSet = preparedStatement.executeQuery();


            while (resultSet.next()) {
                out.println("<form action ='Edit' method='POST'> ");

                out.println("<table>");

                out.println("<tr><td>UserId</td><td>" + resultSet.getString("id") + "</td></tr>");
                out.println("<tr><td>UserName</td><td><input type='text' name ='name'  id='name' value='" + resultSet.getString("name") +
                        " ' /> </td></tr>");
                out.println("<tr><td>UserPassword</td><td><input type='text' name ='password'  id='password' value='" + resultSet.getString("password") +
                        " ' /> </td></tr>");
                out.println("<tr><td>UserEmail</td><td><input type='text' name='email' id='email' value='"+ resultSet.getString("email") +"'/></td></tr>");

                out.println("<tr><td colspan ='2'> <input type='submit' value='Edit'/> </td></tr>");


                out.println("</table>");

                out.println("</form>");
            }
        } catch (ClassNotFoundException | SQLException e) {

            out.println(e);

        }

    }
}


