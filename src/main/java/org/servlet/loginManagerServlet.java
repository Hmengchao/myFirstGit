package org.servlet;

import com.google.gson.Gson;
import org.db.Managerimp;
import org.db.ResponseUtil;
import org.entity.Manager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/logssin")
public class loginManagerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        int count=0;
        String Mana_Name = request.getParameter("Mana_Name");
        String Mana_PWD = request.getParameter("Mana_PWD");
        System.out.println(Mana_Name + "   " + Mana_PWD);
        if (Mana_Name == null || Mana_PWD == null) {
           /* print.print("登录失败");
            print.close();*/
            System.out.println("登陆失败");
            return;
        }
        Manager manager=new Manager();
        Manager manager1=null;
        manager.setMana_Name(Mana_Name);
        manager.setMana_Age(Mana_PWD);
        try {
            manager1= Managerimp.QueryManager(manager);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(manager1);
        if(manager1!=null)
            count=1;
        Map<String,Boolean> map = new HashMap<String,Boolean>();
        map.put("result", false);
        if(count == 1){
            map.put("result", true);
        }
        Gson gson = new Gson();
        String json = gson.toJson(map);

        ResponseUtil.print(response, json);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
