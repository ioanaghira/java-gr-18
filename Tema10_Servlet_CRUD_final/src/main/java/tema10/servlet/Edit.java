package tema10.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/Edit")
public class Edit extends HttpServlet {
    Connection connection;
    PreparedStatement preparedStatement;


    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/usermanagement", "postgres", "postgres");

            String name = req.getParameter("name");
            String password = req.getParameter("password");
            String email = req.getParameter("email");
            String id = req.getParameter("id");

            preparedStatement = connection.prepareStatement("update user_model set name= ?, password= ?, email=? where id = ? ");


            preparedStatement.setString(1, name);
            preparedStatement.setString(2, password);
            preparedStatement.setString(3, email);


//TODOO: getid from getParameter- not working :NULL

            preparedStatement.setInt(4, 10);
            preparedStatement.executeUpdate();

            out.println("Record updated!");

            out.println("<p><a href =\"ViewUser\">View User</a></p>");

        } catch (ClassNotFoundException | SQLException e) {
            out.println("Record failed!");
            out.println(e);

        }

    }
}


