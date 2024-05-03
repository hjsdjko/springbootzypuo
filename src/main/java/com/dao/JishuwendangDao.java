package com.dao;

import com.entity.JishuwendangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JishuwendangVO;
import com.entity.view.JishuwendangView;


/**
 * 技术文档
 * 
 * @author 
 * @email 
 * @date 2022-05-27 16:31:40
 */
public interface JishuwendangDao extends BaseMapper<JishuwendangEntity> {
	
	List<JishuwendangVO> selectListVO(@Param("ew") Wrapper<JishuwendangEntity> wrapper);
	
	JishuwendangVO selectVO(@Param("ew") Wrapper<JishuwendangEntity> wrapper);
	
	List<JishuwendangView> selectListView(@Param("ew") Wrapper<JishuwendangEntity> wrapper);

	List<JishuwendangView> selectListView(Pagination page,@Param("ew") Wrapper<JishuwendangEntity> wrapper);
	
	JishuwendangView selectView(@Param("ew") Wrapper<JishuwendangEntity> wrapper);
	

}
