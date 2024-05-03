package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YunweirenyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YunweirenyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YunweirenyuanView;


/**
 * 运维人员
 *
 * @author 
 * @email 
 * @date 2022-05-27 16:31:40
 */
public interface YunweirenyuanService extends IService<YunweirenyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YunweirenyuanVO> selectListVO(Wrapper<YunweirenyuanEntity> wrapper);
   	
   	YunweirenyuanVO selectVO(@Param("ew") Wrapper<YunweirenyuanEntity> wrapper);
   	
   	List<YunweirenyuanView> selectListView(Wrapper<YunweirenyuanEntity> wrapper);
   	
   	YunweirenyuanView selectView(@Param("ew") Wrapper<YunweirenyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YunweirenyuanEntity> wrapper);
   	

}

