package com.company.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.company.pojo.User;

/**
 * @author lsp
 * @category 用户dao层接口
 */
public interface UserDao {
	/**
	 * 查询所有用户
	 * 
	 * @return
	 */
	List<User> findUserAll();

	/**
	 * 通过部门id查找用户
	 * 
	 * @param dId
	 * @return
	 */
	List<User> findUserByDid(int dId);

	/**
	 * 通过用户名密码查询(登录用)
	 */
	User findUserByName(@Param(value = "uName") String uName, @Param(value = "pass") String pass);

	/**
	 * 通过用户id查找用户
	 * 
	 * @param uId
	 */
	User findUserByUid(int uId);

	/**
	 * 根据职位查找用户
	 * 
	 * @param jobId
	 * @return
	 */
	List<User> findUserByJobId(int jobId);
	
	/**
	 * 根据职位与职等查找用户
	 * 
	 * @param jobId
	 * @param lId
	 * @return
	 */
	List<User> findUserByJobIdAndELId(@Param(value = "jobId") int jobId, @Param(value = "lId") int lId);
	
	/**
	 * 注册用户
	 */
	int regist(User user);

	/**
	 * 通过用户id删除用户
	 * 
	 * @param uId
	 * @return
	 */
	int deleteUser(int uId);

	/**
	 * 根据部门id删除用户
	 * 
	 * @param dId
	 * @return
	 */
	int deleteUserByDid(int dId);

	/**
	 * 根据职位与职等删除用户
	 * 
	 * @param jobId
	 * @param lId
	 * @return
	 */
	int deleteUserByJobId(@Param(value = "jobId") int jobId, @Param(value = "lId") int lId);

	/**
	 * 删除所有用户
	 * 
	 * @return
	 */
	int deleteUserAll();

	/**
	 * 更新用户信息
	 * 
	 * @param user
	 * @return
	 */
	int upDate(User user);
	/**
	 * 批量删除
	 */
	int deleteArray(int[] uIds);
}
