package com.nnp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nnp.bo.EmployeeBO;

//@Repository
public class EmployeeDAO1 implements IEmployeeDAO {
	public static final String GET_EMP_DETAILS = "SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE EMPNO=?";
	public static final String GET_EMP_BY_DESG = "SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE JOB IN (?,?,?)";
	public static final String GET_EMP_BY_DEPTNO = "SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE DEPTNO=?";

	private List<EmployeeBO> li;

	@Autowired
	private JdbcTemplate jt;

	@Override
	public EmployeeBO getEmp(int empNo) {
		return jt.queryForObject(GET_EMP_DETAILS, new RowMapper<EmployeeBO>() {
			@Override
			public EmployeeBO mapRow(ResultSet rs, int rowNum) throws SQLException {
				EmployeeBO bo = new EmployeeBO();
				bo.setEmpNo(rs.getInt(1));
				bo.setEname(rs.getString(2));
				bo.setJob(rs.getString(3));
				bo.setSal(rs.getFloat(4));
				bo.setDeptNo(rs.getInt(5));
				return bo;
			}
		}, empNo);
	}

	@Override
	public List<EmployeeBO> getEmpByJobs(String desg1, String desg2, String desg3) {
		return jt.query(GET_EMP_BY_DESG, new ResultSetExtractor<List<EmployeeBO>>() {
			@Override
			public List<EmployeeBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<EmployeeBO> libos = new ArrayList<>();
//										EMPNO,ENAME,JOB,SAL,DEPTNO 
				while (rs.next()) {
					EmployeeBO bo = new EmployeeBO();
					bo.setEmpNo(rs.getInt(1));
					bo.setEname(rs.getString(2));
					bo.setJob(rs.getString(3));
					bo.setSal(rs.getFloat(4));
					bo.setDeptNo(rs.getInt(5));
					libos.add(bo);
				}
				return libos;
			}
		}, desg1, desg2, desg3);
	}

	@Override
	public List<EmployeeBO> getEmpByDepts(int deptNo) {
		jt.query(GET_EMP_BY_DEPTNO, new RowCallbackHandler() {
			@Override
			public void processRow(ResultSet rs) throws SQLException {
				li = new ArrayList<>();
				EmployeeBO bo = new EmployeeBO();
				bo.setEmpNo(rs.getInt(1));
				bo.setEname(rs.getString(2));
				bo.setJob(rs.getString(3));
				bo.setSal(rs.getFloat(4));
				bo.setDeptNo(rs.getInt(5));
				li.add(bo);
			}// method
		}, deptNo);
		return li;
	}// deptNo method

}// class
