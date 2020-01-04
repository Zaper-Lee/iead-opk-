package com.company.service;

import java.util.List;

import com.company.pojo.Salary;

/**
 * @author lsp
 * @category 薪资业务逻辑接口
 *
 */
public interface SalaryService {
	/**
	 * 按薪水id查找薪资标准
	 * 
	 * @param id
	 * @return
	 */
	Salary findSalaryById(String id);

	/**
	 * 根据职等id与职位id共同确认薪资标准
	 * 
	 * @param lId
	 * @param jobId
	 * @return
	 */
	Salary findSalary(String lId, String jobId);

	/**
	 * 根据职位id查询薪资标准
	 * 
	 * @param jobId
	 * @return
	 */
	List<Salary> findSalaryByJobId(String jobId);

	/**
	 * 更新薪资标准
	 * 
	 * @param salary
	 * @return
	 */
	boolean updateSalary(Salary salary);
}
