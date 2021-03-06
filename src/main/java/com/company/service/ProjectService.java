package com.company.service;

import java.util.Date;
import java.util.List;
import com.company.pojo.Project;

/**
 * @author Josh
 * @category 项目业务逻辑层接口
 *
 */

public interface ProjectService {

	/**
	 * 查询所有项目
	 * 
	 * @return
	 */
	List<Project> findProAll();

	/**
	 * 根据项目ID查找项目
	 * 
	 * @param pId
	 * @return
	 */
	Project findProByPId(String pId);

	/**
	 * 通过项目名查询项目(ajax动态实现模糊查询)
	 * 
	 * @param pName
	 * @return
	 */
	List<Project> findProByPName(String pName);

	/**
	 * 通过项目类型查找项目
	 * 
	 * @param proTid
	 * @return
	 */
	List<Project> findProByTid(String proTid);

	/**
	 * 通过项目状态id查找项目
	 * 
	 * @param sId
	 * @return
	 */
	List<Project> findProBySid(String stateId);

	/**
	 * 通过部门id查找项目
	 * 
	 * @param dId
	 * @return
	 */
	List<Project> findProByDid(String dep_did);

	/**
	 * 通过时间段查找项目
	 * 
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	List<Project> findProByDate(Date startDate, Date endDate);

	/**
	 * 通过项目id，以及时间段共同查找项目
	 * 
	 * @param uId
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	List<Project> findPro(String dep_did, Date startDate, Date endDate);

	/**
	 * 删除所有项目
	 */
	boolean deleteProAll();

	/**
	 * 通过项目id删除项目
	 * 
	 * @param pId
	 * @return
	 */
	boolean deleteProByPId(String pId);

	/**
	 * 通过项目类型id删除项目
	 * 
	 * @param proTid
	 * @return
	 */
	boolean deleteProByTId(String proTid);

	/**
	 * 通过部门id删除项目
	 * 
	 * @param dep_did
	 * @return
	 */
	boolean deleteProByDId(String dep_did);

	/**
	 * 通过状态id删除项目
	 * 
	 * @param sId
	 * @return
	 */
	boolean deleteProBySId(String stateId);

	/**
	 * 更新项目信息
	 * 
	 * @param pro
	 * @return
	 */
	boolean updatePro(Project pro);

	/**
	 * 创建一个项目
	 * 
	 * @param pro
	 * @return
	 */
	boolean addPro(Project pro);

	/**
	 * 提交项目修改项目状态ID
	 */
	int submitproject(int approveStateId, int pId);

	/**
	 * 通过项目审批状态id查找项目
	 * 
	 * @param sId
	 * @return
	 */
	List<Project> findProByASid(String approveStateId);
	
	/**
	 * 根据pid更新项目stateid信息
	 * 
	 * @param pro
	 * @return
	 */
	int updatePro(String pId, String stateId);
	/**
	 * 批量删除
	 */
	boolean deletePro(int[] pIds);
}
