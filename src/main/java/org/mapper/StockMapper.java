package org.mapper;

import org.entity.Stock;

import java.util.List;

public interface StockMapper {
    public Stock QueryStockById(String id);
    public List<Stock> QueryAllStock();
    public int DeleteStockById(String id);
    public int InsertStock(Stock stock);
    public int updateStockById(Stock stock);
}
