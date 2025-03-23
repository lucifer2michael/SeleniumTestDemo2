package com.funnygorilla.studentmanagement.services;  

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.funnygorilla.studentmanagement.dto.StudentDTO;
import com.funnygorilla.studentmanagement.repository.StudentRepository;
import com.funnygorilla.studentmanagement.repository.dataaccess.StudentDB;
import com.funnygorilla.studentmanagement.services.factory.StudentFactory;

@Service  
public class StudentServiceImpl implements StudentService {  
	
	@Autowired  
	private StudentRepository studentRepository;  
	@Autowired  
	private StudentFactory factory;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public List<StudentDTO> getAllStudents()
	{  
		List <StudentDTO> all = new ArrayList<StudentDTO>();  
		List <StudentDB> sdbs = this.studentRepository.getAllStudents();
		
		StudentDTO dto = null;
		Iterator<StudentDB> r = sdbs.iterator();
		while (r.hasNext()) {
			dto = Converter.fromStudentDBStudentDTO(r.next());
			all.add(dto);
		}
		return all;  
	}  
	
	@Override
	public StudentDTO getStudentByID(Long id)
	{  
		logger.debug(" ---------------> getStudentByID() called in Service. ");
		StudentDB studentDB = this.studentRepository.getStudentByID(id);
		StudentDTO dto = Converter.fromStudentDBStudentDTO(studentDB);
		return dto;
	}  
	
	@Override
	public Long createStudent(StudentDTO sdto){  
		logger.debug(" ---------------> [Student Service] createStudent() before save(). ");
		StudentDB sdb = this.factory.create(sdto);
		logger.debug(" ---------------> [Student Service] createStudent() after save(). ");
		return sdb.getId();
	}  
	
	@Override
	public StudentDTO updateStudent (StudentDTO sdto ) {
		logger.debug(" ---------------> [Student Service] upStudent() before update(): " + sdto.toString());
		StudentDB sdb = Converter.fromStudentDTOToStudentDB(sdto);
		sdb = this.studentRepository.updateStudent(sdb);
		logger.debug(" ---------------> [Student Service] upStudent() after update(): " + sdb.toString());
		StudentDTO sto = Converter.fromStudentDBStudentDTO(sdb);
		return  sto;
	}
	
	@Override
	public boolean deleteStudent (Long studentId) {
		return this.studentRepository.deleteStudent(studentId);
	}
	
	private static class Converter {
		
		public static StudentDB fromStudentDTOToStudentDB (StudentDTO studentDTO) {
			StudentDB studentDB = new StudentDB();
			// simple converter logic.
		    BeanUtils.copyProperties(studentDTO, studentDB);
		    return studentDB;
	    }
		
	    public static StudentDTO fromStudentDBStudentDTO(StudentDB sbo) {
			StudentDTO studentDTO = new StudentDTO();
			// simple converter logic.
		    BeanUtils.copyProperties(sbo, studentDTO);
		    return studentDTO;
	    }
	}

}  