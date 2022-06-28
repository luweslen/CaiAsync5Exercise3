
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.Auth;

public class Login extends HttpServlet {
    @Override
    protected void doPost(
            HttpServletRequest request, 
            HttpServletResponse response
    ) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        Auth auth = new Auth(email, password);
        
        boolean isLogged = auth.login();
        if(isLogged){
            HttpSession session = request.getSession();
            session.setAttribute("isLogged", auth);
            response.sendRedirect("users.jsp");
        } else {
            response.sendRedirect("index.html");
        }
    }

}
