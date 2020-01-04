package com.company.dao;

import java.util.List;

import com.company.pojo.Office;

/**
 * @author lsp
 * @category 办公用品dao接口
 * 
 */
public interface OfficeDao {
	/**
	 * 根据办公用品id查询办公用品
	 * 
	 * @param oId
	 * @return
	 */
	Office findOfficeByOId(int oId);
	
	/**
	 * 根据请求状态查找办公用品
	 * 
	 * @param requestStateId
	 * @return
	 */
	List<Office> findOfficeByRSId(int requestStateId);
	
	/**
	 * 查找所有的办公用品
	 * 
	 * @return
	 */
	List<Office> findOfficeAll();
	
	/**
	 * 更新办公用品
	 * 
	 * @param office
	 * @return
	 */
	int updateOffice(Office office);
	
	/**
	 * 根据办公用品id删除办公用品
	 * 
	 * @param oId
	 * @return
	 */
	int deleteOfficeByOId(int oId);
	
	/**
	 * 添加一个办公用品
	 * 
	 * @param office
	 * @return
	 */
	int addOffice(Office office);
	/**
	 * 批量删除
	 */
	int deleteArr(int[] oIds);
	
	int updateRequest(int requestStateId);
}
