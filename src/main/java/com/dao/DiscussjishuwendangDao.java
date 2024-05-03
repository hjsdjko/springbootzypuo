package com.dao;

import com.entity.DiscussjishuwendangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjishuwendangVO;
import com.entity.view.DiscussjishuwendangView;


/**
 * 技术文档评论表
 * 
 * @author 
 * @email 
 * @date 2022-05-27 16:31:40
 */
public interface DiscussjishuwendangDao extends BaseMapper<DiscussjishuwendangEntity> {
	
	List<DiscussjishuwendangVO> selectListVO(@Param("ew") Wrapper<DiscussjishuwendangEntity> wrapper);
	
	DiscussjishuwendangVO selectVO(@Param("ew") Wrapper<DiscussjishuwendangEntity> wrapper);
	
	List<DiscussjishuwendangView> selectListView(@Param("ew") Wrapper<DiscussjishuwendangEntity> wrapper);

	List<DiscussjishuwendangView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjishuwendangEntity> wrapper);
	
	DiscussjishuwendangView selectView(@Param("ew") Wrapper<DiscussjishuwendangEntity> wrapper);
	

}
