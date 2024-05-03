package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WentibaobiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WentibaobiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WentibaobiaoView;


/**
 * 问题报表
 *
 * @author 
 * @email 
 * @date 2022-05-27 16:31:40
 */
public interface WentibaobiaoService extends IService<WentibaobiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WentibaobiaoVO> selectListVO(Wrapper<WentibaobiaoEntity> wrapper);
   	
   	WentibaobiaoVO selectVO(@Param("ew") Wrapper<WentibaobiaoEntity> wrapper);
   	
   	List<WentibaobiaoView> selectListView(Wrapper<WentibaobiaoEntity> wrapper);
   	
   	WentibaobiaoView selectView(@Param("ew") Wrapper<WentibaobiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WentibaobiaoEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<WentibaobiaoEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<WentibaobiaoEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<WentibaobiaoEntity> wrapper);
}

