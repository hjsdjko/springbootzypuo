package com.dao;

import com.entity.WentixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WentixinxiVO;
import com.entity.view.WentixinxiView;


/**
 * 问题信息
 * 
 * @author 
 * @email 
 * @date 2022-05-27 16:31:40
 */
public interface WentixinxiDao extends BaseMapper<WentixinxiEntity> {
	
	List<WentixinxiVO> selectListVO(@Param("ew") Wrapper<WentixinxiEntity> wrapper);
	
	WentixinxiVO selectVO(@Param("ew") Wrapper<WentixinxiEntity> wrapper);
	
	List<WentixinxiView> selectListView(@Param("ew") Wrapper<WentixinxiEntity> wrapper);

	List<WentixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<WentixinxiEntity> wrapper);
	
	WentixinxiView selectView(@Param("ew") Wrapper<WentixinxiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<WentixinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<WentixinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<WentixinxiEntity> wrapper);
}
