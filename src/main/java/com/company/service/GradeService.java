package com.company.service;

import java.util.List;

import com.company.pojo.Grade;

/**
 * @author lsp
 * @category 考核等级业务逻辑
 */
public interface GradeService {
	/**
	 * 查询所有考核等级
	 * 
	 * @return
	 */
	List<Grade> findGradeAll();
	
	/**
	 * 根据考核等级id查找考核等级
	 * 
	 * @param gradeId
	 * @return
	 */
	Grade findGradeByGId(String gradeId);
}
