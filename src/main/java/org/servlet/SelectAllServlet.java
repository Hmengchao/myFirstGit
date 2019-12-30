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
import java.util.List;

@WebServlet("/select")
public class SelectAllServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        System.out.println("11111111111");
        connect conect =new connect();
        SqlSession session=null;
        try {
            session=conect.beginMybatis();
        } catch (Exception e) {
            e.printStackTrace();
        }

        CargoMapper cargoMapper=session.getMapper(CargoMapper.class);
        List<Cargo> list=cargoMapper.QueryAllCargo();
//        for (Cargo cargo:list
//             ) {
//            System.out.println(cargo);
//        }

        Gson gson = new Gson();
        String json = gson.toJson(list);

        ResponseUtil.print(response, json);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
