package com.dao;

import com.entity.YunweirenyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YunweirenyuanVO;
import com.entity.view.YunweirenyuanView;


/**
 * 运维人员
 * 
 * @author 
 * @email 
 * @date 2022-05-27 16:31:40
 */
public interface YunweirenyuanDao extends BaseMapper<YunweirenyuanEntity> {
	
	List<YunweirenyuanVO> selectListVO(@Param("ew") Wrapper<YunweirenyuanEntity> wrapper);
	
	YunweirenyuanVO selectVO(@Param("ew") Wrapper<YunweirenyuanEntity> wrapper);
	
	List<YunweirenyuanView> selectListView(@Param("ew") Wrapper<YunweirenyuanEntity> wrapper);

	List<YunweirenyuanView> selectListView(Pagination page,@Param("ew") Wrapper<YunweirenyuanEntity> wrapper);
	
	YunweirenyuanView selectView(@Param("ew") Wrapper<YunweirenyuanEntity> wrapper);
	

}
