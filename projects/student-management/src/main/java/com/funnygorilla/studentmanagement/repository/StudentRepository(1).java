package com.funnygorilla.studentmanagement.repository;  

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.funnygorilla.studentmanagement.repository.dataaccess.StudentDAO;
import com.funnygorilla.studentmanagement.repository.dataaccess.StudentDB;
 

@Repository
public class StudentRepository  
{
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	StudentDAO studentDao;

	/**
	 * 
	 * @return
	 */
	public List<StudentDB> getAllStudents(){
		return this.studentDao.findAll();
	}
	/**
	 * 
	 * @param id
	 * @return
	 */
	public StudentDB getStudentByID(Long id) {
		return this.getStudentDB(id);
	}
	/**
	 * 
	 * @param student
	 * @return
	 */
	public Long createStudent(StudentDB studentDB) {
		
		studentDB = this.studentDao.saveAndFlush(studentDB);
		logger.debug("--> student " + studentDB.toString() +  " created.");
		return studentDB.getId();
	}
	/**
	 * 
	 * @param student
	 * @return
	 */
	public StudentDB updateStudent (StudentDB studentDB) {
		Long targetID = studentDB.getId();
		
		// retrieve student from repository
		StudentDB  sdb = this.getStudentDB(targetID);
		
		// if it does not exist return null;
		if (sdb == null) {
			logger.warn("--> student " + targetID +  " does not exist!");
			return null;
		}
		
		// if it exist, update it and return updated record.
        sdb = this.studentDao.saveAndFlush(studentDB);
        logger.debug("--> student " + sdb.toString() +  " updated.");
		return sdb;
	}
	/**
	 * 
	 * @param studentId
	 */
	public boolean deleteStudent (Long studentId) {
		StudentDB sdb = this.getStudentDB(studentId);
		
		if (null == sdb) {
			logger.debug("--> student " + studentId +  " does not exit and nothing has been deleted.");
			return false;
		}
		
		this.studentDao.deleteById(studentId);
		logger.debug("--> student " + studentId +  " deleted.");
		return true;
	}
	/**
	 * retrieve student record by id.
	 * @param id
	 * @return
	 */
	private StudentDB getStudentDB (Long id) {
		
		StudentDB sdb = this.studentDao.findById(id).orElse(null);
		if (null == sdb) {
			logger.warn("--> student " + id +  " does not exist!");
		}
		
		return sdb;
	}
}