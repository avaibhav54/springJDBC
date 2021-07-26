package com.toDo.springJDBC.dao;

import java.util.List;

import com.toDo.springJDBC.entities.student;

public interface studentDAO {
public int insert(student stud);
public int change(student stud);
public int delete(int sid);
public student getStudent(int sid);
public List<student> getAllStudents();
}
