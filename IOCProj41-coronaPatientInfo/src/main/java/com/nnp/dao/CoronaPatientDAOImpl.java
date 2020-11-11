package com.nnp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.nnp.bo.CoronaPatientBO;

public class CoronaPatientDAOImpl implements CoronaPatientDAO {
	private static final String PATIENTS_BY_STATUS = "SELECT P_NAME,P_AGE,LOCATION,STATUS FROM SER_CORONA_REG WHERE STATUS IN(?,?) ORDER BY STATUS";

	private DataSource ds;

	public CoronaPatientDAOImpl(DataSource ds) {
		super();
		this.ds = ds;
	}


	@Override
	public List<CoronaPatientBO> getPatientList(String status1, String status2) throws Exception {
		List<CoronaPatientBO> libos = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		CoronaPatientBO bo = null;

		libos = new ArrayList();
		try {
			// getConnection
			con = ds.getConnection();
			// prepare stmt
			if (con != null)
				ps = con.prepareStatement(PATIENTS_BY_STATUS);
			// assign parameteres
			if (ps != null) {
				ps.setString(1, status1);
				ps.setString(2, status2);

				// execute query
				rs = ps.executeQuery();
			}

			if (rs != null) {
				while (rs.next()) {
					bo = new CoronaPatientBO();
					bo.setPName(rs.getString(1));
					bo.setPAge(rs.getInt(2));
					bo.setLoc(rs.getString(3));
					bo.setStatus(rs.getString(4));
					libos.add(bo);
				}
			}
		} // try
		catch (Exception se) {
			throw se;
		} // catch
		finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if (ps != null)
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if (con != null)
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

		return libos;
	}

}
