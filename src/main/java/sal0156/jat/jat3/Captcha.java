package sal0156.jat.jat3;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet(name = "captcha", value = "/captcha")
public class Captcha extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Cannot use method GET. Use Post");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("username");
        String password = request.getParameter("password");
        response.setContentType("text/html");
        try(PrintWriter pw = response.getWriter()) {
            pw.println("<html><body>");
            pw.println("<h1>" + login + " " + password + "</h1>");
            pw.println("</body></html>");
        }
    }
}