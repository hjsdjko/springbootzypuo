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


import com.dao.YunweirenyuanDao;
import com.entity.YunweirenyuanEntity;
import com.service.YunweirenyuanService;
import com.entity.vo.YunweirenyuanVO;
import com.entity.view.YunweirenyuanView;

@Service("yunweirenyuanService")
public class YunweirenyuanServiceImpl extends ServiceImpl<YunweirenyuanDao, YunweirenyuanEntity> implements YunweirenyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YunweirenyuanEntity> page = this.selectPage(
                new Query<YunweirenyuanEntity>(params).getPage(),
                new EntityWrapper<YunweirenyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YunweirenyuanEntity> wrapper) {
		  Page<YunweirenyuanView> page =new Query<YunweirenyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YunweirenyuanVO> selectListVO(Wrapper<YunweirenyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YunweirenyuanVO selectVO(Wrapper<YunweirenyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YunweirenyuanView> selectListView(Wrapper<YunweirenyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YunweirenyuanView selectView(Wrapper<YunweirenyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
