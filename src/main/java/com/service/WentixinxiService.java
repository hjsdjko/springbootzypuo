package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WentixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WentixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WentixinxiView;


/**
 * 问题信息
 *
 * @author 
 * @email 
 * @date 2022-05-27 16:31:40
 */
public interface WentixinxiService extends IService<WentixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WentixinxiVO> selectListVO(Wrapper<WentixinxiEntity> wrapper);
   	
   	WentixinxiVO selectVO(@Param("ew") Wrapper<WentixinxiEntity> wrapper);
   	
   	List<WentixinxiView> selectListView(Wrapper<WentixinxiEntity> wrapper);
   	
   	WentixinxiView selectView(@Param("ew") Wrapper<WentixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WentixinxiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<WentixinxiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<WentixinxiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<WentixinxiEntity> wrapper);
}

