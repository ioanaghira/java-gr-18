package tema10.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet("/SaveUser")
public class SaveUser extends HttpServlet {
    Connection connection;
    PreparedStatement preparedStatement;


    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/usermanagement", "postgres", "postgres");

            String id = req.getParameter("id");
            String name = req.getParameter("name");
            String password = req.getParameter("password");
            String email = req.getParameter("email");
            String type = req.getParameter("type");

            preparedStatement = connection.prepareStatement("insert into user_model(id,name,password,email,type)values(?,?,?,?,?)");
            preparedStatement.setInt(1, Integer.parseInt(id));
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, password);
            preparedStatement.setString(4, email);
            preparedStatement.setString(5, type);

            preparedStatement.executeUpdate();

            out.println("<p>New user was created!</p>");
            out.println("<p><a href =\"ViewUser\">View User</a></p>");

        } catch (ClassNotFoundException | SQLException e) {
            out.println("Registration failed!");
            out.println(e);

        }

    }
}
