import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;

@WebServlet(name = "/Randomizer", urlPatterns = {"/Randomizer"})
public class Randomizer extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer max_numb = Integer.parseInt(request.getParameter("nmb"));
        Integer count = Integer.parseInt(request.getParameter("nmb_cnt"));
        Random rand = new Random();
        List<Integer> randoms = new ArrayList<Integer>();

        for(int i = 0;i<count;i++){
            randoms.add(rand.nextInt(max_numb+1));
        }

        RequestDispatcher rd = request.getRequestDispatcher("generated.jsp");
        request.setAttribute("numbs",randoms);
        rd.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
