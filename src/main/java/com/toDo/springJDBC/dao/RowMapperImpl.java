package com.toDo.springJDBC.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.toDo.springJDBC.entities.student;

public class RowMapperImpl implements RowMapper<student>{

	public student mapRow(ResultSet rs, int rowNum) throws SQLException {
	student st=new student();
	st.setId(rs.getInt(1));
	st.setName(rs.getString(2));
	st.setCity(rs.getString(3));
	return st;
	}

}
