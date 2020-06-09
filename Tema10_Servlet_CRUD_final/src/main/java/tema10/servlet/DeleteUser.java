package tema10.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/DeleteUser")
public class DeleteUser extends HttpServlet {
    Connection connection;
    PreparedStatement preparedStatement;


    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String id = req.getParameter("id");

        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/usermanagement", "postgres", "postgres");


            preparedStatement = connection.prepareStatement("delete from user_model where id = ? ");

            preparedStatement.setInt(1, Integer.parseInt(id));

            preparedStatement.executeUpdate();

            out.println("Record deleted!");

            out.println("<p><a href =\"ViewUser\">View User</a></p>");

        } catch (ClassNotFoundException | SQLException e) {
            out.println("Record failed!");
            out.println(e);

        }

    }
}


