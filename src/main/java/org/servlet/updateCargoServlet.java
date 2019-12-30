package org.servlet;

import com.google.gson.Gson;
import org.apache.ibatis.session.SqlSession;
import org.db.ResponseUtil;
import org.db.connect;
import org.entity.Cargo;
import org.mapper.CargoMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/update")
public class updateCargoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        System.out.println("read begin");
        String id=request.getParameter("id");
        System.out.println(id);
        String name=request.getParameter("name");
        String type=request.getParameter("type");

        System.out.println("mid");
        SqlSession session= null;
        try {
            session = connect.beginMybatis();
        } catch (Exception e) {
            e.printStackTrace();
        }
        CargoMapper cargoMapper=session.getMapper(CargoMapper.class);
        Cargo cargo=new Cargo(id,name,type);
        System.out.println(cargo.getCargo_ID()+"   "+cargo.getCargo_Name()+"  "+cargo.getCargo_Type());
        int count=cargoMapper.updateCargoById(cargo);
        System.out.println("修改的个数: "+count);

        connect.endMybatis(session);


        Map<String,Boolean> map = new HashMap<String,Boolean>();
        map.put("result", false);
        if(count == 1){
            map.put("result", true);
        }
        Gson gson = new Gson();
        String json = gson.toJson(map);

        ResponseUtil.print(response, json);
        if(count==1)
            System.out.println("Update Success");
        else
            System.out.println("Update failed");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
