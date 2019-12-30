import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.db.StockImp;
import org.entity.Stock;
import org.junit.Test;
import org.mapper.CargoMapper;

import java.io.Reader;
import java.util.List;

public class test {

   /* @Test
    public void findAll() throws SQLException, ClassNotFoundException {
        CargoDao da=new Daoimpl();
        List<Cargo> cargo= da.findAll();
        for (Cargo cargo1:cargo) {
            System.out.print(cargo1.getCargo_ID()+"   ");
            System.out.print(cargo1.getCargo_Name()+"  ");
            System.out.println(cargo1.getCargo_Type());
        }
    }*/
    @Test
    public void QueryCargo() throws Exception {
        Stock stock= StockImp.query("1");
        System.out.println(stock);
//        int count=StockImp.delete("1");
//        System.out.println(count);
        List<Stock> list=StockImp.queryAll();
        for (Stock stock1 : list
             ) {
            System.out.println(stock1);
        }
        Stock so=new Stock("1","123","123",200,"222");
        int count=StockImp.update(so);
        System.out.println(count);


//        Reader reader = Resources.getResourceAsReader("conf.xml");
//        //
//        SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(reader);
//        //session-connection
//        //sessionFactory.getConfiguration().addMapper(StudentMapper.class);
//        SqlSession session = sessionFactory.openSession();
//        ManagerMapper cargoMapper=session.getMapper(ManagerMapper.class);
//        Manager manager=new Manager();
//        manager.setMana_Name("11");
//        manager.setMana_PWD("123");
//        Manager manager1=cargoMapper.QueryManager(manager);
//        System.out.println(manager1);
//        List<Cargo> list=cargoMapper.QueryAllCargo();
//        for (Cargo cargo: list
//             ) {
//            System.out.print(cargo.getCargo_ID()+"   ");
//            System.out.print(cargo.getCargo_Type()+"   ");
//            System.out.println(cargo.getCargo_Name()+"   ");
//        }
//        System.out.println("/n");
//        Cargo car=new Cargo();
//        car.setCargo_ID("2020");
//        car.setCargo_Name("大强");
//        car.setCargo_Type("transport");
//        int number=cargoMapper.updateCargoById(car);
//        System.out.println(number);
//       /* int number=cargoMapper.DeleteCargoById("111");
//        System.out.println(number);*/
//        Cargo cargo=cargoMapper.QueryCargoById("111");
//        System.out.print(cargo.getCargo_ID()+"    ");
//        System.out.print(cargo.getCargo_Name()+"    ");
//        System.out.println(cargo.getCargo_Type());
//        System.out.println(cargo);
////        cargoMapper.InsertCargo(new Cargo("vis","visitor","visitor"));
//        endMybatis(session);

    }

    public void endMybatis(SqlSession session) {
        session.commit();
        session.close();
    }

    public void beginMybatis() throws Exception {
        Reader reader = Resources.getResourceAsReader("conf.xml");
        SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(reader);
        //session-connection
        //sessionFactory.getConfiguration().addMapper(StudentMapper.class);
        SqlSession session = sessionFactory.openSession();
        CargoMapper cargoMapper=session.getMapper(CargoMapper.class);
    }
   /* public void QueryCargoById(SqlSession session){
        CargoMapper cargoMapper=session.getMapper(CargoMapper.class);
        Cargo cargo=cargoMapper.QueryCargoById();
        System.out.println(cargo);
    }*/
}
