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


import com.dao.WentileixingDao;
import com.entity.WentileixingEntity;
import com.service.WentileixingService;
import com.entity.vo.WentileixingVO;
import com.entity.view.WentileixingView;

@Service("wentileixingService")
public class WentileixingServiceImpl extends ServiceImpl<WentileixingDao, WentileixingEntity> implements WentileixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WentileixingEntity> page = this.selectPage(
                new Query<WentileixingEntity>(params).getPage(),
                new EntityWrapper<WentileixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WentileixingEntity> wrapper) {
		  Page<WentileixingView> page =new Query<WentileixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WentileixingVO> selectListVO(Wrapper<WentileixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WentileixingVO selectVO(Wrapper<WentileixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WentileixingView> selectListView(Wrapper<WentileixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WentileixingView selectView(Wrapper<WentileixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
