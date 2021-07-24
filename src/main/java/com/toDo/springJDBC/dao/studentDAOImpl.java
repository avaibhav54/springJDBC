package com.toDo.springJDBC.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.toDo.springJDBC.entities.student;

public class studentDAOImpl implements studentDAO {


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
	

}
