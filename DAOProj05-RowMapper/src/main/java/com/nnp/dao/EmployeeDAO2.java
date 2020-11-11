package com.nnp.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nnp.bo.EmployeeBO;

@Repository
public class EmployeeDAO2 implements IEmployeeDAO {
	public static final String GET_EMP_DETAILS = "SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE EMPNO=?";
	public static final String GET_EMP_BY_DESG = "SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE JOB IN (?,?,?)";
	public static final String GET_EMP_BY_DEPTNO = "SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE DEPTNO=?";

	@Autowired
	private JdbcTemplate jt;

	@Override
	public EmployeeBO getEmp(int empNo) {
		return jt.queryForObject(GET_EMP_DETAILS, (rs, row) -> {
			EmployeeBO bo = new EmployeeBO();
			bo.setEmpNo(rs.getInt(1));
			bo.setEname(rs.getString(2));
			bo.setJob(rs.getString(3));
			bo.setSal(rs.getFloat(4));
			bo.setDeptNo(rs.getInt(5));
			return bo;
		}, empNo);
	}

	@Override
	public List<EmployeeBO> getEmpByJobs(String desg1, String desg2, String desg3) {
		return jt.query(GET_EMP_BY_DESG, (rs) -> {
			List<EmployeeBO> libos = new ArrayList<>();
			// EMPNO,ENAME,JOB,SAL,DEPTNO
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
		}, desg1, desg2, desg3);
	}

	@Override
	public List<EmployeeBO> getEmpByDepts(int deptNo) {
		List<EmployeeBO> li=new ArrayList<>();
		jt.query(GET_EMP_BY_DEPTNO, rs->{
					EmployeeBO bo = new EmployeeBO();
					bo.setEmpNo(rs.getInt(1));
					bo.setEname(rs.getString(2));
					bo.setJob(rs.getString(3));
					bo.setSal(rs.getFloat(4));
					bo.setDeptNo(rs.getInt(5));
					li.add(bo);
			}
		, deptNo);
		return li;
	}
}
