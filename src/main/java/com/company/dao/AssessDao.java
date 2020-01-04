package com.company.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.company.pojo.Assess;
import com.company.vo.AssessVo;

/**
 * @author lsp
 * @category 人员考核dao接口
 *
 */
public interface AssessDao {
	/**
	 * 查找所有的人员考核
	 * 
	 * @return
	 */
	List<Assess> findAssAll();

	/**
	 * 根据考核id查找考核
	 * 
	 * @param aId
	 * @return
	 */
	Assess findAssByAId(int aId);

	/**
	 * 根据考核等级查找考核信息
	 * 
	 * @param gradeId
	 * @return
	 */
	List<Assess> findAssByGId(int gradeId);

	/**
	 * 根据用户id查找用户考核信息
	 * 
	 * @param uId
	 * @return
	 */
	List<Assess> findAssByUId(int uId);

	/**
	 * 根据时间段、人员id查找考核
	 * 
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	Assess findAssByDateAndUId(@Param(value = "uId") int uId, @Param(value = "startDate") Date startDate,
                                      @Param(value = "endDate") Date endDate);

	/**
	 * 根据时间段查找考核
	 * 
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	List<Assess> findAssByDate(@Param(value = "startDate") Date startDate,
                                      @Param(value = "endDate") Date endDate);

	/**
	 * 根据用户id删除考核
	 * 
	 * @param uId
	 * @return
	 */
	int deleteAssByUId(int uId);

	/**
	 * 根据考核id删除考核
	 * 
	 * @param uId
	 * @return
	 */
	int deleteAssByAId(int aId);

	/**
	 * 更新考核信息
	 * 
	 * @param assess
	 * @return
	 */
	int updateAss(Assess assess);

	/**
	 * 增加一条考核
	 * 
	 * @param assess
	 * @return
	 */
	int addAss(Assess assess);
}
