package com.funnygorilla.studentmanagement.services.factory;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.funnygorilla.studentmanagement.dto.StudentDTO;
import com.funnygorilla.studentmanagement.repository.StudentRepository;
import com.funnygorilla.studentmanagement.repository.dataaccess.StudentDB;

/**
 * A factory is a specific DDD citizen theat deals with the logic of creating and
 * initializing a valid entity.
 * 
 * @author guson
 *
 */
@Component
public class StudentFactory {
	
	@Autowired
	StudentRepository repository;
	
	public StudentDB create (StudentDTO studentDto) 
			//throws TechnicalcException 
	{
		
		StudentDB studentDB = new StudentDB();
		BeanUtils.copyProperties(studentDto, studentDB);
		
		Long id = this.repository.createStudent(studentDB);
		studentDB.setId(id);
		
		return studentDB;
	}

}
