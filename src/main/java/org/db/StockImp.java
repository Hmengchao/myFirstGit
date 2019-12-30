package org.db;

import org.apache.ibatis.session.SqlSession;
import org.entity.Stock;
import org.mapper.StockMapper;

import java.util.List;

public class StockImp {
    public static int delete(String id) throws Exception {
        SqlSession session= connect.beginMybatis();
        StockMapper stockMapper=session.getMapper(StockMapper.class);
        int count=stockMapper.DeleteStockById(id);
        connect.endMybatis(session);
        return count;
    }
    public static int insert(Stock stock) throws Exception {
        SqlSession session= connect.beginMybatis();
        StockMapper stockMapper=session.getMapper(StockMapper.class);
        int count=stockMapper.InsertStock(stock);
        connect.endMybatis(session);
        return count;
    }
    public static List<Stock> queryAll() throws Exception {
        SqlSession session= connect.beginMybatis();
        StockMapper stockMapper=session.getMapper(StockMapper.class);
        List<org.entity.Stock> list=stockMapper.QueryAllStock();
        connect.endMybatis(session);
        return list;

    }
    public static Stock query(String id) throws Exception {
        SqlSession session= connect.beginMybatis();
        StockMapper stockMapper=session.getMapper(StockMapper.class);
        Stock stock=stockMapper.QueryStockById(id);
        connect.endMybatis(session);
        return stock;
    }
    public static int update(Stock stock) throws Exception {
        SqlSession session= connect.beginMybatis();
        StockMapper stockMapper=session.getMapper(StockMapper.class);
        int count=stockMapper.updateStockById(stock);
        connect.endMybatis(session);
        return count;
    }

}
