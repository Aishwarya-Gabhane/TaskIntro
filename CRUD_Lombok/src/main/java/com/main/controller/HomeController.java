package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.main.model.Student;
import com.main.serviceInterface.ServiceInter;

@Controller
public class HomeController {

	@Autowired
	ServiceInter si;
	
	@GetMapping("/fetchdata")
	public List<Student>  getAll()
	{
		List<Student> sl=si.getAllData();
		
		return sl;
	}
	
	@PostMapping("/saveData")
	public String saveData(@RequestBody Student s)
	{
		si.saveData(s);
		
		return "Data Saved";
	}
	
	@PutMapping("/updateData")
	public String updateData(@RequestBody Student ss)
	{
		si.updateData(ss);
		
		return "Data Updated";
	}
	
	@DeleteMapping("/deleteData/{id}")
	public String deleteData(@PathVariable int id)
	{
		si.deleteData(id);
		return "data deleted";
	}
	
	@PostMapping("/saveMultipleData")
	public List<Student> saveMultipleData(@RequestBody List<Student> list)
	{
		List<Student> slist=si.saveMulti(list);
		return slist;
	}
}
