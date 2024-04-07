package org.surikov.homework10.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.surikov.homework10.dao.Dao;
import org.surikov.homework10.entity.Students;
import org.surikov.homework10.service.StudentService;

import java.io.IOException;

@WebServlet("/start-servlet")
public class StartServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("students",Dao.select());
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
