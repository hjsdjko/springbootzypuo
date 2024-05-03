package com.dao;

import com.entity.WentibaobiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WentibaobiaoVO;
import com.entity.view.WentibaobiaoView;


/**
 * 问题报表
 * 
 * @author 
 * @email 
 * @date 2022-05-27 16:31:40
 */
public interface WentibaobiaoDao extends BaseMapper<WentibaobiaoEntity> {
	
	List<WentibaobiaoVO> selectListVO(@Param("ew") Wrapper<WentibaobiaoEntity> wrapper);
	
	WentibaobiaoVO selectVO(@Param("ew") Wrapper<WentibaobiaoEntity> wrapper);
	
	List<WentibaobiaoView> selectListView(@Param("ew") Wrapper<WentibaobiaoEntity> wrapper);

	List<WentibaobiaoView> selectListView(Pagination page,@Param("ew") Wrapper<WentibaobiaoEntity> wrapper);
	
	WentibaobiaoView selectView(@Param("ew") Wrapper<WentibaobiaoEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<WentibaobiaoEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<WentibaobiaoEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<WentibaobiaoEntity> wrapper);
}
