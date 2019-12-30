package org.db;

import org.apache.ibatis.session.SqlSession;
import org.entity.Manager;
import org.mapper.ManagerMapper;

public class Managerimp {
    public static Manager QueryManager(Manager mana) throws Exception {
        SqlSession session= connect.beginMybatis();
        ManagerMapper managerMapper=session.getMapper(ManagerMapper.class);
        Manager manager=managerMapper.QueryManager(mana);
        connect.endMybatis(session);
        return manager;
    }
}
