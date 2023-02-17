package com.main.serviceInterface;

import java.util.List;

import com.main.model.Student;

public interface ServiceInter {

	public List<Student> getAllData();

	public void saveData(Student s);

	public void updateData(Student ss);

	public void deleteData(int id);

	public List<Student> saveMulti(List<Student> list);

	

}
