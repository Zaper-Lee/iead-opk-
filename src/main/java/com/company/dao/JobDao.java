package com.company.dao;

import java.util.List;

import com.company.pojo.Job;

/**
 * @author lsp
 * @category 职称Dao接口
 */
public interface JobDao {
	/**
	 * 根据职称id查找职等
	 * 
	 * @param jobId
	 * @return
	 */
	Job findELBylId(int jobId);
	
	/**
	 * 查看所有职称
	 * 
	 * @return
	 */
	List<Job> findELAll();
}
