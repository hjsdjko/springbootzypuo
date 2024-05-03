package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JishuwendangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JishuwendangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JishuwendangView;


/**
 * 技术文档
 *
 * @author 
 * @email 
 * @date 2022-05-27 16:31:40
 */
public interface JishuwendangService extends IService<JishuwendangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JishuwendangVO> selectListVO(Wrapper<JishuwendangEntity> wrapper);
   	
   	JishuwendangVO selectVO(@Param("ew") Wrapper<JishuwendangEntity> wrapper);
   	
   	List<JishuwendangView> selectListView(Wrapper<JishuwendangEntity> wrapper);
   	
   	JishuwendangView selectView(@Param("ew") Wrapper<JishuwendangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JishuwendangEntity> wrapper);
   	

}

