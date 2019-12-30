package org.servlet;

import com.google.gson.Gson;
import org.db.ResponseUtil;
import org.entity.Manager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        int count=0;

        Manager mnger= (Manager) request.getAttribute("manager");
        if(mnger!=null){
            System.out.println("refresh");
            request.getRequestDispatcher("/show.html").forward(request,response);
        }
        else {

            String Mana_Name = request.getParameter("Mana_Name");
            String Mana_PWD = request.getParameter("Mana_PWD");
            System.out.println(Mana_Name + "   " + Mana_PWD);
            if (Mana_Name == null || Mana_PWD == null) {
           /* print.print("登录失败");
            print.close();*/
                System.out.println("登陆失败");
            }
        /*String Popedom=request.getParameter("Popedom");
        String Mana_Sex=request.getParameter("Mana_Sex");
        String Mana_Age=request.getParameter("Mana_Age");
        String Mana_DepID=request.getParameter("Mana_DepID");
        String Mana_Tel=request.getParameter("Mana_Tel");
        String Mana_Address=request.getParameter("Mana_Address");*/

       /* Manager mana=new Manager();
        mana.setMana_Name(Mana_Name);
        mana.setMana_PWD(Mana_PWD);

        SqlSession session= null;
        try {
            session = connect.beginMybatis();
        } catch (Exception e) {
            e.printStackTrace();
        }
        ManagerMapper managerMapper=session.getMapper(ManagerMapper.class);
        Manager manager=managerMapper.QueryManager(mana);
        connect.endMybatis(session);*/

            Connection connntion = null;
            PreparedStatement pst = null;
            ResultSet rst = null;
            Manager manager = null;

            try {

                Class.forName("com.mysql.jdbc.Driver");
                connntion = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket", "root", "123456");
                pst = connntion.prepareCall("select * from Manager where Mana_Name=" + Mana_Name + " and Mana_PWD=" + Mana_PWD);
                rst = pst.executeQuery();
                System.out.println("rst=" + rst);
                while (rst.next()) {
                    count=1;
                    manager = new Manager();
                    manager.setMana_Name(rst.getString("Mana_Name"));
                    manager.setMana_PWD(rst.getString("Mana_PWD"));
                    manager.setMana_Age(rst.getString("Mana_Age"));
                    manager.setMana_Address(rst.getString("Mana_Address"));
                    manager.setMana_DepID(rst.getString("Mana_DepID"));
                    manager.setMana_Sex(rst.getString("Mana_Sex"));
                    manager.setMana_Tel(rst.getString("Mana_Tel"));
                    manager.setPopedom(rst.getString("Popedom"));
                    request.setAttribute("manager", manager);
                    response.sendRedirect("mainSystem.html");
//                    request.getRequestDispatcher("/show.html").forward(request, response);

                }

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
//            System.out.println("你没有跳转啊");
                try {
                    rst.close();
                    pst.close();
                    connntion.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (manager != null) {
                System.out.println("登陆成功");
            } else {
                System.out.println("登陆失败");

                response.setContentType("text/html;charset=utf-8");
                PrintWriter print = response.getWriter();
                print.print("登陆失败");
                print.close();
            }
        }
        Map<String,Boolean> map = new HashMap<String,Boolean>();
        map.put("result", false);
        if(count == 1){
            map.put("result", true);
        }
        Gson gson = new Gson();
        String json = gson.toJson(map);

        ResponseUtil.print(response, json);



//        if(manager==null){
//            request.getRequestDispatcher("mvn_supermarket_war_exploded/show.html").forward(request,response);
//        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
