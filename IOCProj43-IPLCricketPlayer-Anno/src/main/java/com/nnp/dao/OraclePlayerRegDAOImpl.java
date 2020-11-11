package com.nnp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.nnp.bo.PlayerBO;

@Repository("oraDao")
public class OraclePlayerRegDAOImpl implements PlayerRegDAO {
	private static final String PLAYER_INSERT_QUERY = "INSERT INTO SER_IPLPLAYER VALUES(SER_IPL_SEQ.NEXTVAL,?,?,?,?,?)";

	@Autowired
	private DataSource ds;

	@Override
	public int insert(PlayerBO bo) throws SQLException {
		int count = 0;
		Connection con = null;
		PreparedStatement ps = null;

		try {
			// get connection from pooled conn
			con = ds.getConnection();
			// get prepared stmt
			ps = con.prepareStatement(PLAYER_INSERT_QUERY);
			// insert values to query
			ps.setString(1, bo.getName());
			ps.setString(2, bo.getTeam());
			ps.setInt(3, bo.getMatches());
			ps.setFloat(4, bo.getBatAvg());
			ps.setFloat(5, bo.getBowlAvg());

			// perform insert
			count = ps.executeUpdate();

		} catch (SQLException e) {
			throw e;
		} finally {
			try {
				ps.close();
			} catch (Exception e) {}
			try {
				con.close();
			} catch (Exception e) {}
		}

		return count;
	}

}
