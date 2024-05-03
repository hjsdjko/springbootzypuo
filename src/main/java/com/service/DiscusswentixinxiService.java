package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusswentixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusswentixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusswentixinxiView;


/**
 * 问题信息评论表
 *
 * @author 
 * @email 
 * @date 2022-05-27 16:31:40
 */
public interface DiscusswentixinxiService extends IService<DiscusswentixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusswentixinxiVO> selectListVO(Wrapper<DiscusswentixinxiEntity> wrapper);
   	
   	DiscusswentixinxiVO selectVO(@Param("ew") Wrapper<DiscusswentixinxiEntity> wrapper);
   	
   	List<DiscusswentixinxiView> selectListView(Wrapper<DiscusswentixinxiEntity> wrapper);
   	
   	DiscusswentixinxiView selectView(@Param("ew") Wrapper<DiscusswentixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusswentixinxiEntity> wrapper);
   	

}

