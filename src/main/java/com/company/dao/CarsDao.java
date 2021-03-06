package com.company.dao;

import java.util.List;

import com.company.pojo.Cars;

/**
 * @author lsp
 * @category 车辆dao接口
 */
public interface CarsDao {
	/**
	 * 根据 车辆id查询车辆
	 * 
	 * @param carId
	 * @return
	 */
	Cars findCarsById(int carId);
	
	/**
	 * 根据 车辆类型id查询车辆
	 * 
	 * @param carId
	 * @return
	 */
	List<Cars> findCarsByCTId(int carTypeId);
	
	/**
	 * 根据状态id查找车辆
	 * 
	 * @param requestStateId
	 * @return
	 */
	List<Cars> findCarsByRSId(int requestStateId);
	
	/**
	 * 查询所有的车辆
	 * 
	 * @return
	 */
	List<Cars> findCarsAll();
	
	/**
	 * 更新车辆信息
	 * 
	 * @param mr
	 * @return
	 */
	int updateCars(Cars cars);
	
	/**
	 * 根据车辆id删除车辆
	 * 
	 * @param carId
	 * @return
	 */
	int deleteCarsById(int carId);
	
	/**
	 * 添加一个车辆
	 * 
	 * @param mr
	 * @return
	 */
	int addCars(Cars cars);
	/**
	 * 批量删除
	 */
	int deleteCarArray(int[] carIds);
}
