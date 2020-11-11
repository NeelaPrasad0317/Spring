package com.nnp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.nnp.bo.EmployeeBO;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String ALL_EMP_DETAILS = "SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP";

	@NonNull
	private DataSource ds;

	@Override
	public List<EmployeeBO> getDetails() {
		List<EmployeeBO> liBos = new ArrayList<>();
		EmployeeBO ebo = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			// get connection
			if (ds != null)
				con = ds.getConnection();
			// create prepare stmt
			if (con != null)
				ps = con.prepareStatement(ALL_EMP_DETAILS);
			// execute query
			if (ps != null)
				rs = ps.executeQuery();

			// store recoreds into bo objs
			while (rs.next()) {
				ebo = new EmployeeBO();
				ebo.setEmpno(rs.getInt(1));
				ebo.setEname(rs.getString(2));
				ebo.setJob(rs.getString(3));
				ebo.setSal(rs.getFloat(4));
				ebo.setDeptno(rs.getInt(5));

				liBos.add(ebo);
			}
		} // try
		catch (Exception e) {
			e.printStackTrace();
		} // catch
		finally {
			//close objs
			try {
				if (rs != null)
					rs.close();
			} catch (SQLException e) {}
			try {
				if (ps != null)
					rs.close();
			} catch (SQLException e) {}
			try {
				if (con != null)
					rs.close();
			} catch (SQLException e) {}
		}

		return liBos;
	}

}
