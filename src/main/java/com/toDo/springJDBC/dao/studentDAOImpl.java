package com.toDo.springJDBC.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.toDo.springJDBC.entities.student;
@Component("studentDao")
public class studentDAOImpl implements studentDAO {

@Autowired
private JdbcTemplate template;
	public JdbcTemplate getTemplate() {
	return template;
}
public void setTemplate(JdbcTemplate template) {
	this.template = template;
}
	public int insert(student stud) {
		String query ="Insert into student(id,name,city) values(?,?,?)";
	    
		return this.template.update(query,stud.getId(),stud.getName(),stud.getCity());
		
	}
	public int change(student stud) {
	
		//updating data;
		String query="update student set name=? , city=? where id=?";

		return this.template.update(query,stud.getName(),stud.getCity(),stud.getId());
		
	}
	public int delete(int sid) {
		String query="delete from  student where id=?";

		return this.template.update(query,sid);
		
	}
	public student getStudent(int sid) {
//selecting select single data
		String query="Select * from student where id=?";
		RowMapper<student> rowMapper=new RowMapperImpl();
		return this.template.queryForObject(query,rowMapper,sid);
	}
	public List<student> getAllStudents() {
		String query="Select * from student";
		RowMapper<student> rowMapper=new RowMapperImpl();
		return this.template.query(query,rowMapper);

		
	}
	

}
