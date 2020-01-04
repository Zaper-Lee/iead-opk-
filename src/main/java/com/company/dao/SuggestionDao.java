package com.company.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.company.pojo.Suggestion;

public interface SuggestionDao {	
	/**
	 * 查找所有的意见
	 * 
	 * @return
	 */
	List<Suggestion> findSugAll();
	
	/**
	 * 通过意见id查找意见
	 * 
	 * @return
	 */
	Suggestion findSugBySid(int sugId);
	
	/**
	 * 通过用户查找当前用户的所有意见
	 * 
	 * @param uId
	 * @return
	 */
	List<Suggestion> findSugByUid(int uId);
	
	/**
	 * 通过时间段查找意见
	 * 
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	List<Suggestion> findSugByDate(@Param(value = "startDate") Date startDate, @Param(value = "endDate") Date endDate);

	/**
	 * 通过用户意见id删除意见
	 * 
	 * @param sugId
	 * @return
	 */
	int deleteSugBySid(int sugId);
	
	/**
	 * 通过用户id删除意见
	 * 
	 * @param uI
	 * @return
	 */
	int deleteSugByUid(int uId);
	
	/**
	 * 通过时间段删除意见
	 * 
	 * @param uId
	 * @return
	 */
	int deleteSugByDate(@Param(value = "startDate") Date startDate, @Param(value = "endDate") Date endDate);
	
	/**
	 * 修改意见
	 * 
	 * @param suggestion
	 * @return
	 */
	int updateSug(Suggestion suggestion);
	
	/**
	 * 添加意见
	 * 
	 * @param suggestion
	 * @return
	 */
	int addSug(Suggestion suggestion);
}
