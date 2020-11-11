package com.nnp.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDAO {
	public static final String GET_EMP_COUNT = "SELECT COUNT(*) FROM EMP";
	public static final String GET_ENAME_ID = "SELECT ENAME FROM EMP WHERE EMPNO=?";
	public static final String GET_EMP_DETAILS = "SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE EMPNO=?";
	public static final String GET_EMP_BY_DESG = "SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE JOB IN (?,?)";
	public static final String ENTER_EMP = "INSERT INTO EMP(EMPNO,ENAME,JOB,SAL) VALUES(EMPNO_SEQ.NEXTVAL,?,?,?)";

	
	private JdbcTemplate jt;

	public EmployeeDAO(JdbcTemplate jt) {
		super();
		this.jt = jt;
	}

	public int getEmpCount() {
		return jt.queryForObject(GET_EMP_COUNT, Integer.class);
	}

	public String getEnameById(int empNo) {
		return jt.queryForObject(GET_ENAME_ID, String.class, empNo);
	}

	public Map<String, Object> getEmpDetails(int empNo) {
		return jt.queryForMap(GET_EMP_DETAILS, empNo);
	}

	public List<Map<String, Object>> getEmpByDesg(String desg1, String desg2) {
		
		return jt.queryForList(GET_EMP_BY_DESG, desg1,desg2);
	}

	public int enterEmp(String name, String job, float sal) {
			
		return jt.update(ENTER_EMP, name,job,sal);
	}
}
