package kosta.ridonbox.model.dao;

import java.sql.SQLException;

import kosta.ridonbox.model.dto.BranchDTO;
import kosta.ridonbox.model.dto.EventDTO;
import kosta.ridonbox.model.dto.MovieDTO;

public interface AdminDAO {
	
	/**
	 * 이벤트 등록
	 * @param evetDAO 
	 * @return boolean : true - 성공, false - 실패
	 */
	public boolean evetInsert(EventDTO evetDTO) throws SQLException;
	
	/**
	 * 이벤트 업데이트
	 * @param evetNo (pk)
	 * @return EventDTO (수정된 dto를 넘겨받아 출력)
	 */
	public EventDTO evetUpdate(int evetNo) throws SQLException;

	/**
	 * 이벤트 삭제
	 * @param evetNo (pk)
	 * @return boolean : true - 성공, false - 실패
	 */
	public boolean evetDelete(int evetNo) throws SQLException;

	/**
	 * 영화 등록
	 * @param MovieDTO
	 * @return boolean : true - 성공, false - 실패
	 */
	public boolean movieInsert(MovieDTO movieDTO) throws SQLException;

	/**
	 * 영화 수정
	 * @param movieNo (pk)
	 * @return boolean : true - 성공, false - 실패
	 */
	public boolean movieUpdate(int movieNo) throws SQLException;

	/**
	 * 상영 시간표 정보 등록
	 * @param BranchDTO 
	 * @return boolean : true - 성공, false - 실패
	 */
	public boolean branchInsert(BranchDTO branchDTO) throws SQLException;

	/**
	 * 상영 시간표 정보 수정
	 * @param branchNo (pk) //복합키로 관리하는게 편함
	 * @return boolean : true - 성공, false - 실패
	 */
	public BranchDTO branchUpdate(int branchNo) throws SQLException;


}
