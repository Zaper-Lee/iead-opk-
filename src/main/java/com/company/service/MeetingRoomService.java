package com.company.service;

import java.util.List;

import com.company.pojo.MeetingRoom;

/**
 * @author lsp
 * @category 会议室service接口
 *
 */
public interface MeetingRoomService {
	/**
	 * 根据会议室id查找会议室
	 * 
	 * @param roomId
	 * @return
	 */
	MeetingRoom findMeetingRoomById(String roomId);

	/**
	 * 根据会议室状态id查找会议室
	 * 
	 * @param requestStateId
	 * @return
	 */
	List<MeetingRoom> findMeetingRoomByRSId(String requestStateId);

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
	boolean updateMeetingRoom(MeetingRoom mr);

	/**
	 * 删除会议室通过会议室id
	 * 
	 * @param roomId
	 * @return
	 */
	boolean deleteMeetingRoomById(String roomId);

	/**
	 * 添加会议室
	 * 
	 * @param mr
	 * @return
	 */
	boolean addMeetingRoom(MeetingRoom mr);

	/**
	 * 根据会议室编号修改会议室使用状态
	 * 
	 * @param roomId
	 * @param requestStateId
	 * @return
	 */
	boolean updateRequest(int roomId, int requestStateId);
}
