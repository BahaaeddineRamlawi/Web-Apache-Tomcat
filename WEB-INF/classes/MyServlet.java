import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MyServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Bonjour</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Bonjour " + request.getParameter("nom") + " " + request.getParameter("prenom") + "</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}
