package org.servlet;

import com.google.gson.Gson;
import org.apache.ibatis.session.SqlSession;
import org.db.ResponseUtil;
import org.db.connect;
import org.mapper.CargoMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/delete")
public class deleteCargoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        String id=request.getParameter("id");
        System.out.println(id);
        SqlSession session= null;
        try {
            session = connect.beginMybatis();
        } catch (Exception e) {
            e.printStackTrace();
        }
        CargoMapper cargoMapper=session.getMapper(CargoMapper.class);
        int count=cargoMapper.DeleteCargoById(id);

        connect.endMybatis(session);

        System.out.println(count);
        Map<String,Boolean> map = new HashMap<String,Boolean>();
        map.put("result", false);
        if(count == 1){
            map.put("result", true);
        }
        Gson gson = new Gson();
        String json = gson.toJson(map);

        ResponseUtil.print(response, json);
        if(count==0)
            System.out.println("delete failed");
        else
            System.out.println("delete success");



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
