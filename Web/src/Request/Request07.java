package Request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author wyl
 * @create 2020-10-08
 * @Description request 请求转发
 * @Version
 */

@WebServlet("/Request07")
public class Request07 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Request07 被访问。。。");

        //共享数据（request域）
        req.setAttribute("msg","hello");

        //请求转发

        req.getRequestDispatcher("/Request08").forward(req,resp); //流式编程


    }
}