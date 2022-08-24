package com.example.webproject1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = {"/rs"},loadOnStartup = -1)
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        //获取用户请求发送的数据
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        System.out.println("提交的数据:" + username + password);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        //获取用户请求发送的数据
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        System.out.println("提交的数据:" + username + password);

        //2 响应数据给客户端
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("register success!");
    }
}
