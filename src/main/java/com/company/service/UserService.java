package com.company.service;

import java.util.List;

import com.company.pojo.User;
import com.company.vo.UserVo;

public interface UserService {

	/**
	 * 根据用户id查找用户
	 * 
	 * @param uId
	 * @return
	 */
	User findUserByUId(String uId);

	/**
	 * 通过部门id查找用户
	 * 
	 * @param dId
	 * @return
	 */
	List<User> findUserByDid(String dId);
	
	/**
	 * 通过用户名密码查询(登录用)
	 */
	 User findUserByName(String uName, String pass);

	/**
	 * 按员工职位查找用户
	 * 
	 * @param jobId
	 * @return
	 */
	List<User> findUserByJobId(String jobId);
	
	/**
	 * 按员工职位和职等查找用户
	 * 
	 * @param jobId
	 * @param lId
	 * @return
	 */
	List<User> findUserByJobIdAndELId(String jobId, String lId);
	
	/**
	 * 查询所有部门经理
	 * 
	 * @param jobId
	 * @return
	 */
	 List<User> findDeptLeaderAll();
	
	/**
	 * 通过部门id查找用户(不包含项目领导返回)
	 * 
	 * @param dId
	 * @return
	 */
	List<User> findUserByDidNoLeader(String dId);
	
	/**
	 * 根据用户id查找用户
	 * 
	 * @param uId
	 * @return
	 */
	UserVo findUserVoByUId(String uId);
	
	/**
	 * 查询所有部门经理(返回vo)
	 * 
	 * @param jobId
	 * @return
	 */
	List<UserVo> findDeptLeaderVoAll();
	
	/**
	 * 通过部门id查找用户(不包含项目领导返回vo)
	 * 
	 * @param dId
	 * @return
	 */
	List<UserVo> findUserVoByDidNoLeader(String dId);
	
	/**
	 * 根据用户id查找用户(返回vo)
	 * 
	 * @param uId
	 * @return
	 */
	List<UserVo> findUserVoAll();
	
	/**
	 * 注册用户
	 */
	boolean regist(User user);

	/**
	 * 查询所有用户
	 * 
	 * @return
	 */
	List<User> findUserAll();

	/**
	 * 通过用户id删除用户
	 * 
	 * @param uId
	 * @return
	 */
	boolean deleteUser(String uId);

	/**
	 * 根据部门id删除用户
	 * 
	 * @param dId
	 * @return
	 */
	boolean deleteUserByDid(String dId);

	/**
	 * 更新用户信息
	 * 
	 * @param user
	 * @return
	 */
	boolean update(User user);
	/**
	 * 批量删除
	 */
	boolean deleteArray(int[] uIds);
}
