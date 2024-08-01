package kr.co.kosta.model2;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import kr.co.kosta.common.DBConnPoolTest;

public class MVCBoardDAO extends DBConnPoolTest {

	public MVCBoardDAO() {
		super();
	}
	
	// (검색 조건) 게시물의 개수 반환
	public int selectCount(Map<String, Object> map) {
		int totalCount = 0;
		String query = "select count(*) from mvcboard";
		
		//검색 조건이 있는 경우 쿼리를 동적으로 수정 
		if(map.get("searchWord") != null) 
			query += " where " +map.get("searchField")+ " like ?";
		
		try {
			pstmt = con.prepareStatement(query);
			
			// 검색 조건이 있을때 파라미터 설정
			if(map.get("searchWord") != null) {
				pstmt.setString(1, "%" +map.get("searchWord")+ "%");
			}
			
			rs = pstmt.executeQuery();
			
			// 결과 가져오기
			if (rs.next()) 
				totalCount = rs.getInt(1);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return totalCount;
	}

	// (검색조건) 게시물 목록 반환 (페이징) 
	public List<MVCBoardDTO> selectListPage(Map<String, Object> map) {
		List<MVCBoardDTO> board = new ArrayList<>();
		
		String query = "select * from mvcboard ";
		
		//검색 조건이 있는 경우 쿼리를 동적으로 수정 
		if(map.get("searchWord") != null) 
			query += " where " +map.get("searchField")
				  + " like '%" +map.get("searchWord")+ "%'";		
		
		query += " order by idx desc";
		
		try {
			pstmt = con.prepareStatement(query);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				MVCBoardDTO dto = new MVCBoardDTO();
				dto.setIdx(rs.getString(1));
				dto.setName(rs.getString(2));
				dto.setTitle(rs.getString(3));
				dto.setContent(rs.getString(4));
				dto.setPostdate(rs.getDate(5));
				dto.setOfile(rs.getString(6));
				dto.setSfile(rs.getString(7));
				dto.setDowncount(rs.getInt(8));
				dto.setPass(rs.getString(9));
				dto.setVisitcount(rs.getInt(10));
				
				board.add(dto);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return board;
	}


}












