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


import com.dao.WentixinxiDao;
import com.entity.WentixinxiEntity;
import com.service.WentixinxiService;
import com.entity.vo.WentixinxiVO;
import com.entity.view.WentixinxiView;

@Service("wentixinxiService")
public class WentixinxiServiceImpl extends ServiceImpl<WentixinxiDao, WentixinxiEntity> implements WentixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WentixinxiEntity> page = this.selectPage(
                new Query<WentixinxiEntity>(params).getPage(),
                new EntityWrapper<WentixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WentixinxiEntity> wrapper) {
		  Page<WentixinxiView> page =new Query<WentixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WentixinxiVO> selectListVO(Wrapper<WentixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WentixinxiVO selectVO(Wrapper<WentixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WentixinxiView> selectListView(Wrapper<WentixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WentixinxiView selectView(Wrapper<WentixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<WentixinxiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<WentixinxiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<WentixinxiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}
