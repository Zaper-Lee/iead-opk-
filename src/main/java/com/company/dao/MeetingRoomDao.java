package com.company.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.company.pojo.MeetingRoom;

/**
 * @author lsp
 * @category 会议室Dao接口
 */
public interface MeetingRoomDao {
	/**
	 * 根据会议室id查找会议室
	 * 
	 * @param roomId
	 * @return
	 */
	MeetingRoom findMeetingRoomById(int roomId);
	
	/**
	 * 根据会议室状态id查找会议室
	 * 
	 * @param requestStateId
	 * @return
	 */
	List<MeetingRoom> findMeetingRoomByRSId(int requestStateId);
	
	/**
	 * 查找所有的会议室
	 * 
	 * @return
	 */
	List<MeetingRoom> findMeetingRoomAll();
	
	/**
	 * 更新会议室(状态)
	 * 
	 * @param mr
	 * @return
	 */
	int updateMeetingRoom(MeetingRoom mr);
	
	/**
	 * 删除会议室通过会议室id
	 * 
	 * @param roomId
	 * @return
	 */
	int deleteMeetingRoomById(int roomId);
	
	/**
	 * 添加会议室
	 * 
	 * @param mr
	 * @return
	 */
	int addMeetingRoom(MeetingRoom mr);
	
	/**
	 * 根据会议室编号修改会议室使用状态
	 * @param roomId
	 * @param requestStateId
	 * @return
	 */
	int updateRequest(@Param("roomId") int roomId, @Param("requestStateId") int requestStateId);
}
