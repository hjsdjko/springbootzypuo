package com.dao;

import com.entity.DiscusswentixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusswentixinxiVO;
import com.entity.view.DiscusswentixinxiView;


/**
 * 问题信息评论表
 * 
 * @author 
 * @email 
 * @date 2022-05-27 16:31:40
 */
public interface DiscusswentixinxiDao extends BaseMapper<DiscusswentixinxiEntity> {
	
	List<DiscusswentixinxiVO> selectListVO(@Param("ew") Wrapper<DiscusswentixinxiEntity> wrapper);
	
	DiscusswentixinxiVO selectVO(@Param("ew") Wrapper<DiscusswentixinxiEntity> wrapper);
	
	List<DiscusswentixinxiView> selectListView(@Param("ew") Wrapper<DiscusswentixinxiEntity> wrapper);

	List<DiscusswentixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusswentixinxiEntity> wrapper);
	
	DiscusswentixinxiView selectView(@Param("ew") Wrapper<DiscusswentixinxiEntity> wrapper);
	

}
