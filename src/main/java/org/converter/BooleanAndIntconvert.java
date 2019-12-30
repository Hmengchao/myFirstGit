package org.converter;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BooleanAndIntconvert extends BaseTypeHandler<Boolean>{
	//	类型转换器
//	java(boolean)->database(number)
//	ps:PerparedStatement对象；
//	i:操作参数的位置
//	parameter:java的值
//	jdbc:jdbc操作的数据库类型
	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, Boolean parameter, JdbcType jdbcType)
			throws SQLException {
		if(parameter)
			ps.setInt(i, 1);
		else
			ps.setInt(i, 0);
	}

	@Override
	public Boolean getNullableResult(ResultSet rs, String columnName) throws SQLException {
		// TODO Auto-generated method stub
		int sexNum=rs.getInt(columnName);
		return sexNum==1?true:false;
	}

	@Override
	public Boolean getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
		int sexNum=rs.getInt(columnIndex);
		return sexNum==1?true:false;
	}

	@Override
	public Boolean getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
		int sexNum=cs.getInt(columnIndex);
		return sexNum==1?true:false;
	}

	
}
