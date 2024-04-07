package org.surikov.homework10.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.surikov.homework10.dao.Dao;
import org.surikov.homework10.entity.Students;

import java.io.IOException;
import java.util.List;

@WebServlet("/start-servlet")
public class StartServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Students> studentsList = Dao.select();
        req.setAttribute("students",studentsList);
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
