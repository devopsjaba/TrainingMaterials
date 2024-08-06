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

	public int insertWrite(MVCBoardDTO dto) {
		int result = 0;
		
		String query = "INSERT INTO mvcboard ( name, title, content, ofile, sfile, pass)  VALUES (?,?,?,?,?,?)";
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getTitle());
			pstmt.setString(3, dto.getContent());
			pstmt.setString(4, dto.getOfile());
			pstmt.setString(5, dto.getSfile());
			pstmt.setString(6, dto.getPass());
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("게시물 입력 중 예외 발생");
			e.printStackTrace();
		}
		
		return result;
	}

	// 주어진 일련번호에 해당하는 게시물 상세보기 
	public MVCBoardDTO selectView(String idx) {
		MVCBoardDTO dto = new MVCBoardDTO();
		String query = "SELECT * FROM mvcboard where idx = ?";
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, idx);	//인파라미터
			rs = pstmt.executeQuery();  //쿼리문 실행
			
			if(rs.next()) {
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
			}
					
		} catch (SQLException e) {
			System.out.println("게시물 상세보기 중 예외 발생");
			e.printStackTrace();
		}
		
		return dto;
	}

	// 파라미터 idx에 해당하는 조회수 1 증가
	public void updateVisitCount(String idx) {
		String query = "UPDATE mvcboard "
				+ "SET visitcount = visitcount + 1 "
				+ "WHERE idx=?";
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, idx);
			int rows = pstmt.executeUpdate();
			if (rows == 0)
				System.out.println("업데이트 행이 없습니다.");
			
		} catch (SQLException e) {
			System.out.println("게시물 조회수 증가 중 예외 발생");
			e.printStackTrace();
		}
		
	}

	public void downCountPlus(String idx) {
		String query = "UPDATE mvcboard "
				+ "SET downcount = downcount + 1 "
				+ "WHERE idx=?";	
		
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, idx);
			int rows = pstmt.executeUpdate();
			if (rows == 0)
				System.out.println("업데이트 행이 없습니다.");
			
		} catch (SQLException e) {
			System.out.println("게시물 다운로드 수 증가 중 예외 발생");
			e.printStackTrace();
		}		
		
	}
	
	// 지정한 비밀번호와 게시물의 비밀번호가 일치하는지 확인
	public boolean confirmPassword(String pass, String idx) {
		boolean isTrue = true;
		
		String sql = "select count(*) from mvcboard where pass = ? and idx = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, pass);
			pstmt.setString(2, idx);
			rs = pstmt.executeQuery();
			rs.next();
			if (rs.getInt(1) == 0)
				isTrue = false;
			
		} catch (SQLException e) {
			isTrue = false;
			e.printStackTrace();
		}
				
		return isTrue;
	}

	// 게시글 수정하기 (파일 업로드 포함)
	public int updatePost(MVCBoardDTO dto) {
		int result = 0;
		
		String query = "UPDATE mvcboard"
				+ " SET name=?, title=?, content=?, ofile=?, sfile=? "
				+ " WHERE idx=? and pass=?";
		
		
		try {
			 pstmt = con.prepareStatement(query);
			 pstmt.setString(1, dto.getName());
			 pstmt.setString(2, dto.getTitle());
			 pstmt.setString(3, dto.getContent());
			 pstmt.setString(4, dto.getOfile());
			 pstmt.setString(5, dto.getSfile());
			 pstmt.setString(6, dto.getIdx());
			 pstmt.setString(7, dto.getPass());
			 
			//쿼리문 실행
			 result = pstmt.executeUpdate();
			 
		} catch (SQLException e) {
			System.out.println("게시물 수정 중 예외 발생");
			e.printStackTrace();
		}
		
		return result;
	}

	public int deletePost(String idx) {
		int result = 0;
		
		String query = "DELETE FROM mvcboard WHERE idx=?";
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, idx);
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("게시물 삭제 중 예외 발생");
			e.printStackTrace();
		}
		
		return result;
	}
	
}












