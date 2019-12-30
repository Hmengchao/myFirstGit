package org.db;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

public class connect {
    public static SqlSession beginMybatis() throws Exception {
        Reader reader = Resources.getResourceAsReader("conf.xml");
        SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(reader);
        //session-connection
        //sessionFactory.getConfiguration().addMapper(StudentMapper.class);
        SqlSession session = sessionFactory.openSession();
        
        return session;
    }
    public static void endMybatis(SqlSession session){
        session.commit();
        session.close();
    }
}
