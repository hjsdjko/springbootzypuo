package com.dao;

import com.entity.WentileixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WentileixingVO;
import com.entity.view.WentileixingView;


/**
 * 问题类型
 * 
 * @author 
 * @email 
 * @date 2022-05-27 16:31:40
 */
public interface WentileixingDao extends BaseMapper<WentileixingEntity> {
	
	List<WentileixingVO> selectListVO(@Param("ew") Wrapper<WentileixingEntity> wrapper);
	
	WentileixingVO selectVO(@Param("ew") Wrapper<WentileixingEntity> wrapper);
	
	List<WentileixingView> selectListView(@Param("ew") Wrapper<WentileixingEntity> wrapper);

	List<WentileixingView> selectListView(Pagination page,@Param("ew") Wrapper<WentileixingEntity> wrapper);
	
	WentileixingView selectView(@Param("ew") Wrapper<WentileixingEntity> wrapper);
	

}
