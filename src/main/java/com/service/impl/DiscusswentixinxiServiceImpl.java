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


import com.dao.DiscusswentixinxiDao;
import com.entity.DiscusswentixinxiEntity;
import com.service.DiscusswentixinxiService;
import com.entity.vo.DiscusswentixinxiVO;
import com.entity.view.DiscusswentixinxiView;

@Service("discusswentixinxiService")
public class DiscusswentixinxiServiceImpl extends ServiceImpl<DiscusswentixinxiDao, DiscusswentixinxiEntity> implements DiscusswentixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusswentixinxiEntity> page = this.selectPage(
                new Query<DiscusswentixinxiEntity>(params).getPage(),
                new EntityWrapper<DiscusswentixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusswentixinxiEntity> wrapper) {
		  Page<DiscusswentixinxiView> page =new Query<DiscusswentixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusswentixinxiVO> selectListVO(Wrapper<DiscusswentixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusswentixinxiVO selectVO(Wrapper<DiscusswentixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusswentixinxiView> selectListView(Wrapper<DiscusswentixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusswentixinxiView selectView(Wrapper<DiscusswentixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
