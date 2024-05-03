package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.WentibaobiaoDao;
import com.entity.WentibaobiaoEntity;
import com.service.WentibaobiaoService;
import com.entity.vo.WentibaobiaoVO;
import com.entity.view.WentibaobiaoView;

@Service("wentibaobiaoService")
public class WentibaobiaoServiceImpl extends ServiceImpl<WentibaobiaoDao, WentibaobiaoEntity> implements WentibaobiaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WentibaobiaoEntity> page = this.selectPage(
                new Query<WentibaobiaoEntity>(params).getPage(),
                new EntityWrapper<WentibaobiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WentibaobiaoEntity> wrapper) {
		  Page<WentibaobiaoView> page =new Query<WentibaobiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WentibaobiaoVO> selectListVO(Wrapper<WentibaobiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WentibaobiaoVO selectVO(Wrapper<WentibaobiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WentibaobiaoView> selectListView(Wrapper<WentibaobiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WentibaobiaoView selectView(Wrapper<WentibaobiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<WentibaobiaoEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<WentibaobiaoEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<WentibaobiaoEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
