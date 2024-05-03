package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjishuwendangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjishuwendangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjishuwendangView;


/**
 * 技术文档评论表
 *
 * @author 
 * @email 
 * @date 2022-05-27 16:31:40
 */
public interface DiscussjishuwendangService extends IService<DiscussjishuwendangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjishuwendangVO> selectListVO(Wrapper<DiscussjishuwendangEntity> wrapper);
   	
   	DiscussjishuwendangVO selectVO(@Param("ew") Wrapper<DiscussjishuwendangEntity> wrapper);
   	
   	List<DiscussjishuwendangView> selectListView(Wrapper<DiscussjishuwendangEntity> wrapper);
   	
   	DiscussjishuwendangView selectView(@Param("ew") Wrapper<DiscussjishuwendangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjishuwendangEntity> wrapper);
   	

}

