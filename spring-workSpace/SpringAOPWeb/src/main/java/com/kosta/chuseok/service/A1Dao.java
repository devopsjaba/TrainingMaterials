package com.kosta.chuseok.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class A1Dao {

	@Autowired
	DataSource ds;
	
	public int insert(int key, int value) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement("insert into a1 values(?, ?)");
			pstmt.setInt(1, key);
			pstmt.setInt(2, value);
					
			return pstmt.executeUpdate();			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt, conn);
		}

		return 0;
				
	}
	
	private void close(AutoCloseable...closeables) {
		for(AutoCloseable autoCloseable : closeables) {
			if (autoCloseable != null)
				try {
					autoCloseable.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
		}
		
	}
	
}

















