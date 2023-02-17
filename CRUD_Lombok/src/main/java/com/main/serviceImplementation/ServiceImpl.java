package com.main.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.RepositoryInter.RepositoryInter;
import com.main.model.Student;
import com.main.serviceInterface.ServiceInter;

@Service
public class ServiceImpl implements ServiceInter{
	
	@Autowired
	RepositoryInter ri;

	@Override
	public List<Student> getAllData() {
		
		return (List<Student>) ri.findAll();
	}

	@Override
	public void saveData(Student s) {
		ri.save(s);
		
	}

	@Override
	public void updateData(Student ss) {
		ri.save(ss);
		
	}

	@Override
	public void deleteData(int id) {

        ri.deleteById(id);
		
	}

	@Override
	public List<Student> saveMulti(List<Student> list) {
		
		return (List<Student>) ri.saveAll(list);
	}



}
