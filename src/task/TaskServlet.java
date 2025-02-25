package task;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/TaskServlet")
public class TaskServlet extends HttpServlet {
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html");

    PrintWriter out = response.getWriter();
    out.println("<html><head><title>Current Tasks</title></head><body>");
    out.println("<h1>Current Tasks</h1>");

    HttpSession session = request.getSession();
    ArrayList<String> tasks = (ArrayList<String>) session.getAttribute("tasks");

    if (tasks != null && !tasks.isEmpty()) {
      ((PrintWriter) out).println("<ul>");
      for (String task : tasks) {
        out.println("<li>" + task + "</li>");
      }
      out.println("</ul>");
    } else {
      out.println("<p>No tasks</p>");
    }

    out.println("</body></html>");
  }

  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String taskText = request.getParameter("taskText");

    HttpSession session = request.getSession();
    ArrayList<String> tasks = (ArrayList<String>) session.getAttribute("tasks");

    if (tasks == null) {
      tasks = new ArrayList<>();
    }

    tasks.add(taskText);
    session.setAttribute("tasks", tasks);

    response.sendRedirect("TaskServlet");
  }
}

