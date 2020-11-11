package com.sp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.sp.bo.CustomerBO;

public class CustomerDAOImpl implements CustomerDAO {
	private static final String CUST_INSERT_QUERY = "INSERT INTO SP_CUSTOMER VALUES(SP_CUST_SEQ.NEXTVAL,?,?,?,?)";

	private DataSource ds;

	// Constructor DS injection
	public CustomerDAOImpl(DataSource ds) {
		this.ds = ds;
	}


	@Override
	public int insert(CustomerBO bo) throws Exception {
		int count = 0;
		Connection con = null;
		PreparedStatement ps = null;

		// get pooled connection
		try {
			con = ds.getConnection();
			// create Preapres Stmt
			ps = con.prepareStatement(CUST_INSERT_QUERY);
			// set values to query
			ps.setString(1, bo.getName());
			ps.setString(2, bo.getAdd());
			ps.setFloat(3, bo.getPamt());
			ps.setFloat(4, bo.getIntamt());

			// execute and return o/p value

			count = ps.executeUpdate();
		} catch (SQLException e) {
			throw e;
		} finally {
			try {
				ps.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return count;
	}

}

