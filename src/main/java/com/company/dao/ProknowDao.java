package com.company.dao;

import java.util.List;

import com.company.pojo.Proknow;

public interface ProknowDao {
	
	/**
	 * 通过项目id查找当前项目支持的知识
	 * 
	 * @param dId
	 * @return
	 */
	List<Proknow> findProKnowByPId(int pId);
	
	
	/**
	 * 通过项目编号删除所有的项目知识支持
	 * 
	 * @param dId
	 * @return
	 */
	int deleteProKnowByPId(int pId);
	
	/**
	 * 添加项目支持
	 * 
	 * @return
	 */
	int addProKnow(Proknow proKnow);
}
