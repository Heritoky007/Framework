package etu1894.framework.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import utility.Utility;

public class FrontServlet extends HttpServlet {

  protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    PrintWriter out = resp.getWriter();
    out.println(Utility.getUrl(String.valueOf(req.getRequestURL())));
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    try {
      processRequest(req, resp);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    try {
      processRequest(req, resp);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
