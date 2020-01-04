package com.company.service;

import java.util.Date;
import java.util.List;

import com.company.pojo.Assess;
import com.company.vo.AssessVo;

public interface AssessService {
	/**
	 * 查找所有的人员考核
	 * 
	 * @return
	 */
	List<AssessVo> findAssAll();
	
	/**
	 * 根据考核id查找考核
	 * 
	 * @param aId
	 * @return
	 */
	AssessVo findAssByAId(String aId);
	
	/**
	 * 根据考核等级查找考核信息
	 * 
	 * @param gradeId
	 * @return
	 */
	List<AssessVo> findAssByGId(String gradeId);
	
	/**
	 * 根据用户id查找用户考核信息
	 * 
	 * @param uId
	 * @return
	 */
	List<AssessVo> findAssByUId(String uId);
	
	/**
	 * 根据时间段查找考核
	 * 
	 * @param startDate 
	 * @param endDate
	 * @return
	 */
	List<AssessVo> findAssByDate(Date startDate, Date endDate);
		
	/**
	 * 根据时间段、人员id查找考核
	 * 
	 * @param startDate 
	 * @param endDate
	 * @return
	 */
	List<AssessVo> findAssByDateAndUId(String uId, Date startDate, Date endDate);
	
	/**
	 * 根据时间段、人员id查找考核
	 * 
	 * @param startDate 
	 * @param endDate
	 * @return
	 */
	List<AssessVo> findAssByDateAndGId(String gradeId, Date startDate, Date endDate);
	
	/**
	 * 根据用户id删除考核
	 * 
	 * @param uId
	 * @return
	 */
	boolean deleteAssByUId(String uId);
	
	/**
	 * 根据考核id删除考核
	 * 
	 * @param uId
	 * @return
	 */
	boolean deleteAssByAId(String aId);
	
	/**
	 * 更新考核信息
	 * 
	 * @param assess
	 * @return
	 */
	boolean updateAss(Assess assess);
	
	/**
	 * 增加一条考核
	 * 
	 * @param assess
	 * @return
	 */
	boolean addAss(Assess assess);
}
