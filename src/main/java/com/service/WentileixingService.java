package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WentileixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WentileixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WentileixingView;


/**
 * 问题类型
 *
 * @author 
 * @email 
 * @date 2022-05-27 16:31:40
 */
public interface WentileixingService extends IService<WentileixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WentileixingVO> selectListVO(Wrapper<WentileixingEntity> wrapper);
   	
   	WentileixingVO selectVO(@Param("ew") Wrapper<WentileixingEntity> wrapper);
   	
   	List<WentileixingView> selectListView(Wrapper<WentileixingEntity> wrapper);
   	
   	WentileixingView selectView(@Param("ew") Wrapper<WentileixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WentileixingEntity> wrapper);
   	

}

