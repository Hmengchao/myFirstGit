package org.servlet;

import com.google.gson.Gson;
import org.db.ResponseUtil;
import org.db.StockImp;
import org.entity.Stock;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/InsertStock")
public class InsertStockServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        int count=0;
        System.out.println("read begin");
        String id=request.getParameter("id");
        String Cargo_ID=request.getParameter("Cargo_ID");
        String Stock_Num=request.getParameter("Stock_Num");
        double Stock_Price=Double.parseDouble(request.getParameter("Cargo_ID"));
        String Mana_Name =request.getParameter("Mana_Name");

        Stock stock=new Stock();
        stock.setId(id);
        stock.setCargo_ID(Cargo_ID);
        stock.setMana_Name(Mana_Name);
        stock.setStock_Num(Stock_Num);
        stock.setStock_Price(Stock_Price);

        try {
            count=StockImp.insert(stock);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Map<String,Boolean> map = new HashMap<String,Boolean>();
        map.put("result", false);
        if(count == 1){
            map.put("result", true);
        }
        Gson gson = new Gson();
        String json = gson.toJson(map);

        ResponseUtil.print(response, json);
        System.out.println("Inert Success");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
