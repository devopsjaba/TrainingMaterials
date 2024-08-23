package com.kosta.chuseok.service2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.stereotype.Repository;

@Repository
public class A1Daoo {

	@Autowired
	DataSource ds;
	
	public int insert(int key, int value) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			
			conn=DataSourceUtils.getConnection(ds);
			System.out.println("conn= " + conn);
			
			pstmt = conn.prepareStatement("insert into a1 values(?, ?)");
			pstmt.setInt(1, key);
			pstmt.setInt(2, value);
					
			return pstmt.executeUpdate();			
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			//close(pstmt, conn);
			close(pstmt);
			DataSourceUtils.releaseConnection(conn, ds);  // 트랜잭션 매니저가 판단해서 close 여부를 정함 
		}
		//return 0;		
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
	
	public void deleteAll() throws SQLException {
		Connection conn = ds.getConnection();
		String sql = "delete from a1";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.executeUpdate();
		close(pstmt, conn);
	}
	
}

















