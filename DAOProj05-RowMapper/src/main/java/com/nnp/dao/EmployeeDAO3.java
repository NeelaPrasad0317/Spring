package com.nnp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.nnp.bo.EmployeeBO;

//@Repository
public class EmployeeDAO3 implements IEmployeeDAO {
	public static final String GET_EMP_DETAILS = "SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE EMPNO=?";
	public static final String GET_EMP_BY_DESG = "SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE JOB IN (?,?,?)";
	public static final String GET_EMP_BY_DEPTNO = "SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE DEPTNO=?";

	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public EmployeeBO getEmp(int empNo) {
		return jt.queryForObject(GET_EMP_DETAILS, new BeanPropertyRowMapper<>(EmployeeBO.class), empNo);
	}

	@Override
	public List<EmployeeBO> getEmpByJobs(String desg1, String desg2, String desg3) {
		return jt.query(GET_EMP_BY_DESG,new RowMapperResultSetExtractor<>(new BeanPropertyRowMapper<>(EmployeeBO.class)), desg1,desg2,desg3);
	}

	@Override
	public List<EmployeeBO> getEmpByDepts(int deptNo) {
		return null;
	}
}
