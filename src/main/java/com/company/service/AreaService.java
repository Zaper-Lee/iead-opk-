package com.company.service;

import java.util.List;

import com.company.pojo.Area;

/**
 * @author Johnny
 * @category 区县的业务逻辑层
 */
public interface AreaService {

	/**
	 * 根据城市id，查询相对应的区县列表
	 * @param cityId
	 * @return
	 */
	List<Area> findAreasByCid(String cityId);

	/**
	 * 根据区县id，查询对应的区县对象
	 * @param areaId
	 * @return
	 */
	Area findObject(String areaId);
}
