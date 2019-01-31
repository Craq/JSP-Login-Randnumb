import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "/Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String user = request.getParameter("uname");
        String pass = request.getParameter("psw");
        if(user.equals("admin")&(pass.equals("hacker"))){
            response.sendRedirect("loggedin.jsp");
        }
        else{
            PrintWriter pWriter = response.getWriter();
            pWriter.println("Wrong username/password.");
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.include(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
