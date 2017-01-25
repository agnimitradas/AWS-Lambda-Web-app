package com.sample.projectModule.mysql;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/project")
public class ProjectModuleService {
	
	@Autowired
	private final ProjectModuleRepository repository;
	
	@Autowired
	public ProjectModuleService(ProjectModuleRepository  repository){
		this.repository=repository;
	}
	
	
	@RequestMapping(value="/msg")
	public String getMessage(){
		return "sucess";
	}
	
	
	@RequestMapping(value="/all" ,method=RequestMethod.GET)
	@ResponseBody
	public List<ProjectDetails> getAllPersons(){
		System.out.println("Result from the DataBase::"+repository.findAll());
		return repository.findAll();
	}
	
	@RequestMapping(value="/create",method=RequestMethod.POST)
	@ResponseBody
	public List<ProjectDetails> createProject(@RequestBody ProjectDetails projectDetailsobj){
		repository.save(projectDetailsobj);
		return repository.findAll();
	}
	
	
	

}
